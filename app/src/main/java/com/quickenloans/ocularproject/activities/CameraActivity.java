package com.quickenloans.ocularproject.activities;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.content.FileProvider;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.services.vision.v1.model.BatchAnnotateImagesResponse;
import com.quickenloans.ocularproject.BuildConfig;
import com.quickenloans.ocularproject.R;
import com.quickenloans.ocularproject.utils.ZillowApiUtils;
import com.quickenloans.ocularproject.interfaces.ZillowSearchService;
import com.quickenloans.ocularproject.business_object.zillow.SearchResults;
import com.quickenloans.ocularproject.utils.CameraUtils;
import com.quickenloans.ocularproject.utils.GeneralUtils;
import com.quickenloans.ocularproject.utils.PermissionUtils;
import com.quickenloans.ocularproject.utils.VisionUtils;

import retrofit2.Retrofit;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.quickenloans.ocularproject.utils.VisionUtils.isHouse;

public class CameraActivity extends BaseActivity {

    Context context = this;
    private static final String TAG = CameraActivity.class.getSimpleName();
    private static final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;

    private static final String LOCATION_ADDRESS_KEY = "location-address";

    private FusedLocationProviderClient mFusedLocationClient;
    private Location mLastLocation;
    private String mAddressOutput;
    private AddressResultReceiver mResultReceiver;

    private ProgressBar mProgressBar;
    private ImageView mNewImage;

    BatchAnnotateImagesResponse response;
    private List<Address> mAddressList;
    private Address mFinalAddress;

    private boolean onResumeFromCameraActivity = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        mResultReceiver = new AddressResultReceiver(new Handler());
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
        mNewImage = (ImageView) findViewById(R.id.new_image);

        mAddressOutput = "";
        updateValuesFromBundle(savedInstanceState);

        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        if (!PermissionUtils.getPermissionState(CameraActivity.this)) {
            PermissionUtils.requestPermissions(this, REQUEST_PERMISSIONS_REQUEST_CODE, Manifest.permission.ACCESS_FINE_LOCATION);
        } else {
            getAddress();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!onResumeFromCameraActivity) {
            CameraUtils.openCamera(CameraActivity.this);
        }
    }

    private void updateValuesFromBundle(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            if (savedInstanceState.keySet().contains(LOCATION_ADDRESS_KEY)) {
                mAddressOutput = savedInstanceState.getString(LOCATION_ADDRESS_KEY);
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        onResumeFromCameraActivity = true;

        if (requestCode == Constants.CAMERA_IMAGE_REQUEST && resultCode == RESULT_OK) {
            Uri photoUri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", CameraUtils.getCameraFile(CameraActivity.this));
            mProgressBar.setVisibility(View.VISIBLE);

            Cursor cursor = getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{MediaStore.Images.Media.DATA, MediaStore.Images.Media.DATE_ADDED, MediaStore.Images.ImageColumns.ORIENTATION}, MediaStore.Images.Media.DATE_ADDED, null, "date_added ASC");
            if (cursor != null && cursor.moveToLast()) {
                Uri fileURI = Uri.parse(cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA)));
                String fileSrc = fileURI.toString();

                uploadImage(photoUri, fileSrc);
                cursor.close();
            }
        } else {
            finish();
        }
    }

    public void uploadImage(Uri uri, String fileSrc) {
        if (uri != null) {
            try {
                // scale image
                Bitmap bitmap = CameraUtils.scaleBitmapDown(
                                MediaStore.Images.Media.getBitmap(getContentResolver(), uri),
                                1200);
                callCloudVision(bitmap);
                Bitmap newBitmap = CameraUtils.rotateImage(fileSrc, bitmap);
                mNewImage.setImageBitmap(newBitmap);
            } catch (IOException e) {
                Log.d(TAG, "Image picking failed because " + e.getMessage());
            }
        } else {
            Log.d(TAG, "Image picker gave us a null image.");
        }
    }


    private void callCloudVision(final Bitmap bitmap) throws IOException {
        new AsyncTask<Object, Void, BatchAnnotateImagesResponse>() {
            @Override
            protected BatchAnnotateImagesResponse doInBackground(Object... params) {
                try {
                    return VisionUtils.getResponse(CameraActivity.this, bitmap);
                } catch (GoogleJsonResponseException e) {
                    Log.d(TAG, "failed to make API request because " + e.getContent());
                } catch (IOException e) {
                    Log.d(TAG, "failed to make API request because of other IOException " +
                            e.getMessage());
                }
                return null;
            }

            protected void onPostExecute(BatchAnnotateImagesResponse response) {
                CameraActivity.this.response = response;
                startAddressIntentService(mResultReceiver, mLastLocation);
            }
        }.execute();
    }

    private void verifyImage(BatchAnnotateImagesResponse response) {

        mProgressBar.setVisibility(View.GONE);

        if (foundAddressOfHouse(response)) {
            startSolutionEngineActivity(mFinalAddress);

        } else if (isHouse(response) && !imageStringsMatchesAddress(VisionUtils.getListOfStringsFromImage(response), mAddressList)) {
            createSelectionDialog(mAddressList);
        } else {
            GeneralUtils.showSnackbar(CameraActivity.this, R.string.retake_photo_explanation, R.string.retake,
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            CameraUtils.openCamera(CameraActivity.this);
                        }
                    });
        }
    }

    private boolean foundAddressOfHouse(BatchAnnotateImagesResponse response) {
        return isHouse(response) && imageStringsMatchesAddress(VisionUtils.getListOfStringsFromImage(response), mAddressList);
    }

    private boolean imageStringsMatchesAddress(ArrayList<String> listOfHouseImageStrings, List<Address> mAddressList) {
        for (String houseImageString : listOfHouseImageStrings) {
            for (Address address : mAddressList) {
                if (houseImageString.equals(address.getSubThoroughfare())) {
                    mFinalAddress = address;
                    return true;
                }
            }
        }
        return false;
    }

    public void createSelectionDialog(List<Address> addresses) {

        List<String> listItems = new ArrayList<>();
        final List<Address> addressItems = new ArrayList<>();

        for (Address address : addresses) {
            listItems.add(address.getAddressLine(0));
            addressItems.add(address);
        }

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(CameraActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        View convertView =  inflater.inflate(R.layout.popup_selection, null);
        alertDialog.setView(convertView);
        alertDialog.setTitle(R.string.select_address);

        alertDialog.setNegativeButton(R.string.retake, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                CameraUtils.openCamera(CameraActivity.this);
                dialog.cancel();
            }
        });

        final AlertDialog aDialog = alertDialog.show();

        final ListView lv =  convertView.findViewById(R.id.addressList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listItems);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                aDialog.dismiss();
                startSolutionEngineActivity(addressItems.get(i));
            }
        });
    }

    private void startSolutionEngineActivity(final Address selectedAddress) {
        String address = selectedAddress.getSubThoroughfare() + " " + selectedAddress.getThoroughfare();
        String citystatezip = selectedAddress.getLocality() + ", " + selectedAddress.getAdminArea();

        Retrofit retrofit = ZillowApiUtils.initRetrofit();
        retrofit.create(ZillowSearchService.class).getZillowResults(address, citystatezip).subscribeOn(Schedulers.io()).subscribe(new Action1<SearchResults>() {
            @Override public void call(final SearchResults repoResponse) {
                Log.d("testing", "testing");

                String purchasePrice = repoResponse.getResponse().getResults().getResult().getZestimate().getAmount().getContent();

                Intent intent = new Intent(context, SolutionEngineActivity.class);
                intent.putExtra("streetAddress", selectedAddress);
                intent.putExtra("purchasePrice", purchasePrice);
                intent.putExtra("activityName", "CameraActivity");
                startActivity(intent);

                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

            }
        }, new Action1<Throwable>() {
            @Override public void call(Throwable throwable) {
                Log.d("testing", throwable.getMessage());
                Toast.makeText(context, "Data unavailable", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @SuppressWarnings("MissingPermission")
    public void getAddress() {
        mFusedLocationClient.getLastLocation()
                .addOnSuccessListener(this, new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {
                        if (location == null) {
                            Log.w(TAG, "onSuccess:null");
                            return;
                        }

                        location.setLatitude(42.576849);
                        location.setLongitude(-83.131990);

                        mLastLocation = location;

                        if (!Geocoder.isPresent()) {
                            GeneralUtils.showSnackbar(CameraActivity.this, getString(R.string.no_geocoder_available));
                        }
                    }
                })
                .addOnFailureListener(this, new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "getLastLocation:onFailure", e);
                    }
                });
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString(LOCATION_ADDRESS_KEY, mAddressOutput);
        super.onSaveInstanceState(savedInstanceState);
    }

    private class AddressResultReceiver extends ResultReceiver {
        AddressResultReceiver(Handler handler) {
            super(handler);
        }
        @Override
        protected void onReceiveResult(int resultCode, Bundle resultData) {
            mAddressList = resultData.getParcelableArrayList(Constants.RESULT_DATA_KEY);
            verifyImage(response);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        Log.i(TAG, "onRequestPermissionResult");
        if (requestCode == REQUEST_PERMISSIONS_REQUEST_CODE) {
            if (grantResults.length <= 0) {
                Log.i(TAG, "User interaction was cancelled.");
            } else if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getAddress();
            } else {
                GeneralUtils.showSnackbar(CameraActivity.this, R.string.permission_denied_explanation, R.string.settings,
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent();
                                intent.setAction(
                                        Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                                Uri uri = Uri.fromParts("package",
                                        BuildConfig.APPLICATION_ID, null);
                                intent.setData(uri);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);
                            }
                        });
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}