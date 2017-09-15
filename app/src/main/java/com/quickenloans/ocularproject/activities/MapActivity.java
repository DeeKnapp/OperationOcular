package com.quickenloans.ocularproject.activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.quickenloans.ocularproject.BuildConfig;
import com.quickenloans.ocularproject.R;
import com.quickenloans.ocularproject.utils.ZillowApiUtils;
import com.quickenloans.ocularproject.interfaces.ZillowSearchService;
import com.quickenloans.ocularproject.business_object.zillow.SearchResults;
import com.quickenloans.ocularproject.utils.GeneralUtils;
import com.quickenloans.ocularproject.utils.PermissionUtils;

import retrofit2.Retrofit;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

import java.util.ArrayList;
import java.util.List;


public class MapActivity extends BaseActivity implements
        OnMarkerClickListener,
        OnMapReadyCallback {

    private static final String TAG = CameraActivity.class.getSimpleName();
    private static final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;
    public static final double MAP_BUFFER = .0007;

    private GoogleMap mMap;
    SupportMapFragment mapFragment;
    CoordinatorLayout snackbarCoordinatorLayout;
    ProgressBar progressBar;

    private ResultReceiver mResultReceiver;
    private List<Address> mAddressList;
    private Location mUserLocation = new Location("dummy");
    private Location mLastLocation;
    private FusedLocationProviderClient getLocationClient;
    private final List<Marker> addressMarkers = new ArrayList<>();
    private boolean userMovedScreen = false;
    private Marker lastSelectedAddressMarker;
    private String userMarkerId;
    private boolean isFirstLocation = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.quickenloans.ocularproject.R.layout.activity_map);

        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        snackbarCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.snackbarLocation);
        mResultReceiver = new AddressResultReceiver(new Handler());
        getLocationClient = LocationServices.getFusedLocationProviderClient(this);

        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(MapActivity.this);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
    }

    @Override
    public void onMapReady(GoogleMap map) {

        attemptToGetAddress();
        mMap = map;
        mMap.setOnCameraMoveListener(new GoogleMap.OnCameraMoveListener() {
            @Override
            public void onCameraMove() {
                userMovedScreen = true;
            }
        });
        mMap.setOnCameraIdleListener(new GoogleMap.OnCameraIdleListener() {
            @Override
            public void onCameraIdle() {
                if (userMovedScreen) {
                    updateCameraToNewPosition();
                    startAddressIntentService(mResultReceiver, mLastLocation);
                    userMovedScreen = false;
                }
            }
        });

        addUserMarker();
        mMap.setOnMarkerClickListener(this);
    }

    private void goToUsersLocation() {
        LatLngBounds bounds = new LatLngBounds.Builder()
                .include(new LatLng(mLastLocation.getLatitude() + MAP_BUFFER, mLastLocation.getLongitude() + MAP_BUFFER))
                .include(new LatLng(mLastLocation.getLatitude() - MAP_BUFFER, mLastLocation.getLongitude() - MAP_BUFFER))
                .build();
        mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, 50));
    }

    private void updateCameraToNewPosition() {
        Double cameraLat = mMap.getCameraPosition().target.latitude;
        Double cameraLong = mMap.getCameraPosition().target.longitude;
        mLastLocation.setLatitude(cameraLat);
        mLastLocation.setLongitude(cameraLong);

    }

    private void clearAddressesFromMap() {
        for (Marker marker : addressMarkers) {
            if (!marker.equals(lastSelectedAddressMarker)) {
                marker.remove();
            }
        }
    }

    private void attemptToGetAddress() {
        if (!PermissionUtils.getPermissionState(MapActivity.this)) {
            PermissionUtils.requestPermissions(MapActivity.this, REQUEST_PERMISSIONS_REQUEST_CODE, Manifest.permission.ACCESS_FINE_LOCATION);
        } else {
            getAddress();
        }
    }

    public void returnToUserLocation(View view) {
        LatLngBounds bounds = new LatLngBounds.Builder()
                .include(new LatLng(mUserLocation.getLatitude() + MAP_BUFFER, mUserLocation.getLongitude() + MAP_BUFFER))
                .include(new LatLng(mUserLocation.getLatitude() - MAP_BUFFER, mUserLocation.getLongitude() - MAP_BUFFER))
                .build();
        mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, 50));
        userMovedScreen = true;
    }

    public void returnToLastSelected(View view) {
        if (lastSelectedAddressMarker != null) {
            LatLngBounds bounds = new LatLngBounds.Builder()
                    .include(new LatLng(lastSelectedAddressMarker.getPosition().latitude + MAP_BUFFER, lastSelectedAddressMarker.getPosition().longitude + MAP_BUFFER))
                    .include(new LatLng(lastSelectedAddressMarker.getPosition().latitude - MAP_BUFFER, lastSelectedAddressMarker.getPosition().longitude - MAP_BUFFER))
                    .build();
            mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, 50));
            userMovedScreen = true;
        }
    }

    private void addUserMarker() {
        Marker userMarker = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(mUserLocation.getLatitude(), mUserLocation.getLongitude()))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pegman)));
        userMarkerId = userMarker.getId();
    }

    private void addMarkersToMap() {

        progressBar.setVisibility(View.INVISIBLE);

        for (Address address : mAddressList) {
            if (!addressEqualsLastSelectedMarker(address)) {
                addMarkerToMap(address);
            }
        }
    }

    private boolean addressEqualsLastSelectedMarker(Address address) {
        if (lastSelectedAddressMarker == null) {
            return false;
        } else {
            return address.getLatitude() == lastSelectedAddressMarker.getPosition().latitude && address.getLongitude() == lastSelectedAddressMarker.getPosition().longitude;
        }
    }

    private void addMarkerToMap(Address address) {
        Marker marker = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(
                        address.getLatitude(),
                        address.getLongitude())));
        marker.setTag(address);
        addressMarkers.add(marker);
    }

    @Override
    public boolean onMarkerClick(final Marker marker) {

        if (!marker.getId().equals(userMarkerId)) {
            if (lastSelectedAddressMarker != null) {
                lastSelectedAddressMarker.setIcon(BitmapDescriptorFactory.defaultMarker());
            }
            lastSelectedAddressMarker = marker;

            marker.setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE));
            final Address markerAddress = (Address) marker.getTag();
            showTopSnackbar(markerAddress.getAddressLine(0), getString(R.string.select),
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String address = markerAddress.getSubThoroughfare() + " " + markerAddress.getThoroughfare();
                            String citystatezip = markerAddress.getLocality() + ", " + markerAddress.getAdminArea();

                            Retrofit retrofit = ZillowApiUtils.initRetrofit();
                            retrofit.create(ZillowSearchService.class).getZillowResults(address, citystatezip).subscribeOn(Schedulers.io()).subscribe(new Action1<SearchResults>() {
                                @Override public void call(final SearchResults repoResponse) {
                                    Log.d("testing", "testing");
                                    String purchasePrice = repoResponse.getResponse().getResults().getResult().getZestimate().getAmount().getContent();

                                    Intent intent = new Intent(MapActivity.this, SolutionEngineActivity.class);
                                    intent.putExtra("streetAddress", markerAddress);
                                    intent.putExtra("purchasePrice", purchasePrice);
                                    intent.putExtra("activityName", "MapActivity");
                                    startActivity(intent);
                                }
                            }, new Action1<Throwable>() {
                                @Override public void call(Throwable throwable) {
                                    Log.d("testing", throwable.getMessage());
                                }
                            });
                        }
                    });
        }
        return true;
    }

    // Gets the address for the last known location.
    @SuppressWarnings("MissingPermission")
    private void getAddress() {
        getLocationClient.getLastLocation()
                .addOnSuccessListener(this, new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {
                        if (location == null) {
                            Log.w(TAG, "onSuccess:null");
                            return;
                        }

                        location.setLatitude(42.576849);
                        location.setLongitude(-83.131990);

                        mUserLocation.setLatitude(location.getLatitude());
                        mUserLocation.setLongitude(location.getLongitude());
                        mLastLocation = location;

                        if (isFirstLocation) {
                            progressBar.setVisibility(View.VISIBLE);
                            addUserMarker();
                            goToUsersLocation();
                            isFirstLocation = false;
                        }

                        startAddressIntentService(mResultReceiver, mLastLocation);

                        if (!Geocoder.isPresent()) {
                            GeneralUtils.showSnackbar(MapActivity.this, getString(R.string.no_geocoder_available));
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

    // Receiver for data sent from FetchAddressIntentService
    private class AddressResultReceiver extends ResultReceiver {
        AddressResultReceiver(Handler handler) {
            super(handler);
        }

        @Override
        protected void onReceiveResult(int resultCode, Bundle resultData) {
            mAddressList = resultData.getParcelableArrayList(Constants.RESULT_DATA_KEY);

            clearAddressesFromMap();
            addMarkersToMap();
        }
    }


    private void showTopSnackbar(final String mainText, final String actionText,
                                 View.OnClickListener listener) {
        Snackbar snackbar = Snackbar.make(snackbarCoordinatorLayout, mainText, Snackbar.LENGTH_INDEFINITE)
                .setAction(actionText, listener);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundResource(R.color.black65);
        Button snackViewButton = snackBarView.findViewById(android.support.design.R.id.snackbar_action);
        snackViewButton.setTextColor(Color.WHITE);
        snackbar.show();

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
                GeneralUtils.showSnackbar(MapActivity.this, R.string.permission_denied_explanation, R.string.settings,
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

