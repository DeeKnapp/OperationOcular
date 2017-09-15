package com.quickenloans.ocularproject.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;

import com.quickenloans.ocularproject.R;

import java.util.ArrayList;

public class PermissionUtils {

    public static boolean requestPermissions(final Activity activity, final int requestCode, final String... permissions) {

        final String TAG = activity.getLocalClassName();

        boolean shouldProvideRationale =
                ActivityCompat.shouldShowRequestPermissionRationale(activity,
                        Manifest.permission.ACCESS_FINE_LOCATION);

        boolean granted = true;
        ArrayList<String> permissionsNeeded = new ArrayList<>();

        for (String s : permissions) {
            int permissionCheck = ContextCompat.checkSelfPermission(activity, s);
            boolean hasPermission = (permissionCheck == PackageManager.PERMISSION_GRANTED);
            granted &= hasPermission;
            if (!hasPermission) {
                permissionsNeeded.add(s);
            }
        }

        if (granted) {
            return true;
        } else {
            final String[] permissionArray = permissionsNeeded.toArray(new String[permissionsNeeded.size()]);

            // Provide an additional rationale to the getPermissionState. This would happen if the getPermissionState denied the
            // request previously, but didn't check the "Don't ask again" checkbox.
            if (shouldProvideRationale) {
                Log.i(TAG, "Displaying permission rationale to provide additional context.");

                GeneralUtils.showSnackbar(activity, R.string.permission_rationale, android.R.string.ok,
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Request permission
                                ActivityCompat.requestPermissions(activity,
                                        permissionArray,
                                        requestCode);
                            }
                        });

            } else {
                Log.i(TAG, "Requesting permission");
                // Request permission, possibly answered automatically with "Never ask again."
                ActivityCompat.requestPermissions(activity,
                        permissionArray,
                        requestCode);
            }
            return false;
        }
    }

    public static boolean permissionGranted(int requestCode, int permissionCode, int[] grantResults) {
        return requestCode == permissionCode && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED;
    }

    public static boolean getPermissionState(Context context) {
        int permissionState = ActivityCompat.checkSelfPermission(context,
                Manifest.permission.ACCESS_FINE_LOCATION);
        return permissionState == PackageManager.PERMISSION_GRANTED;
    }
}
