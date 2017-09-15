package com.quickenloans.ocularproject.activities;

import android.content.Intent;
import android.location.Location;
import android.os.ResultReceiver;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ctan on 8/21/17.
 */

public class BaseActivity extends AppCompatActivity {

    protected void startAddressIntentService(ResultReceiver mResultReceiver, Location mLastLocation) {

        Intent intent = new Intent(this, FetchAddressIntentService.class);
        intent.putExtra(Constants.RECEIVER, mResultReceiver);
        intent.putExtra(Constants.LOCATION_DATA_EXTRA, mLastLocation);
        startService(intent);
    }
}
