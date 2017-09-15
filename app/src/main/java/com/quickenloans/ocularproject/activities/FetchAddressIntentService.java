package com.quickenloans.ocularproject.activities;

import android.app.IntentService;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;

import com.quickenloans.ocularproject.R;
import com.quickenloans.ocularproject.utils.VisionUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FetchAddressIntentService extends IntentService {
    private static final String TAG = "FetchAddressIS";
    public static final int NUMBER_OF_CIRCLES = 5;
    public static final int POINTS_CHECKED_IN_CIRCLE = 4;
    public static final int ADDRESS_RESULT_COUNT = 1;
    public static final double RADIUS = 0.0001;

    private ResultReceiver mReceiver;

    public FetchAddressIntentService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String errorMessage = "";

        mReceiver = intent.getParcelableExtra(Constants.RECEIVER);
        if (mReceiver == null) {
            Log.wtf(TAG, "No receiver received. There is nowhere to send the results.");
            return;
        }

        Location location = intent.getParcelableExtra(Constants.LOCATION_DATA_EXTRA);
        if (location == null) {
            errorMessage = getString(R.string.no_location_data_provided);
            Log.wtf(TAG, errorMessage);
            return;
        }

        Geocoder geocoder = new Geocoder(this, Locale.getDefault());
        List<Address> addresses = new ArrayList<Address>();
        double lat = location.getLatitude();
        double longg = location.getLongitude();

        try {
            createListOfAddresses(geocoder, addresses, lat, longg);
        } catch (IOException ioException) {
            errorMessage = getString(R.string.service_not_available);
            Log.e(TAG, errorMessage, ioException);
        } catch (IllegalArgumentException illegalArgumentException) {
            errorMessage = getString(R.string.invalid_lat_long_used);
            Log.e(TAG, errorMessage + ". " +
                    "Latitude = " + location.getLatitude() +
                    ", Longitude = " + location.getLongitude(), illegalArgumentException);
        }

        if (addresses.size() == 0) {
            if (errorMessage.isEmpty()) {
                errorMessage = getString(R.string.no_address_found);
                Log.e(TAG, errorMessage);
            }
        } else {
            Log.i(TAG, getString(R.string.address_found));
            deliverResultToReceiver(Constants.SUCCESS_RESULT, addresses);
        }
    }

    private void createListOfAddresses(Geocoder geocoder, List<Address> addresses, double lat, double longg) throws IOException {
        for (int k = 1; k < NUMBER_OF_CIRCLES; k++) {

            int numberOfAddressesToCheck = k * POINTS_CHECKED_IN_CIRCLE;
            for (int i = 0; i < numberOfAddressesToCheck; i++) {
                double x = lat + (k * RADIUS * Math.cos(i * (Math.PI / 2)));
                double y = longg + (k * RADIUS * Math.sin(i * (Math.PI / 2)));

                boolean contains = false;

                Address addressLine = geocoder.getFromLocation(x, y, ADDRESS_RESULT_COUNT).get(0);

                for (int j = 0; j < addresses.size(); j++) {
                    if (addressLine.getSubThoroughfare().equals(addresses.get(j).getSubThoroughfare())) {
                        contains = true;
                        break;
                    } else
                        contains = false;
                }

                if (!contains && addressLine.getSubThoroughfare() != null && VisionUtils.isNumeric(addressLine.getSubThoroughfare())) {
                    addresses.add(addressLine);
                }
            }
        }
    }

    private void deliverResultToReceiver(int resultCode, List<Address> result) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Constants.RESULT_DATA_KEY, (ArrayList<? extends Parcelable>) result);
        mReceiver.send(resultCode, bundle);

        Log.d("TESTT", "TESTT deliverResultToReceiver");
    }
}
