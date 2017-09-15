package com.quickenloans.ocularproject.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.util.Log;

import com.quickenloans.ocularproject.activities.Constants;

import java.io.File;

/**
 * Created by ctan on 8/21/17.
 */

public class CameraUtils {

    public static void openCamera(Activity activity) {
        if (PermissionUtils.requestPermissions(
                activity,
                Constants.CAMERA_PERMISSIONS_REQUEST,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA)) {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            Uri photoUri = FileProvider.getUriForFile(activity, activity.getApplicationContext().getPackageName() + ".provider", getCameraFile(activity));
            intent.putExtra(MediaStore.EXTRA_OUTPUT, photoUri);
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            activity.startActivityForResult(intent, Constants.CAMERA_IMAGE_REQUEST);
        }
    }

    public static File getCameraFile(Activity activity) {
        File dir = activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        return new File(dir, Constants.FILE_NAME);
    }

    public static Bitmap scaleBitmapDown(Bitmap bitmap, int maxDimension) {

        int originalWidth = bitmap.getWidth();
        int originalHeight = bitmap.getHeight();
        int resizedWidth = maxDimension;
        int resizedHeight = maxDimension;

        if (originalHeight > originalWidth) {
            resizedHeight = maxDimension;
            resizedWidth = (int) (resizedHeight * (float) originalWidth / (float) originalHeight);
        } else if (originalWidth > originalHeight) {
            resizedWidth = maxDimension;
            resizedHeight = (int) (resizedWidth * (float) originalHeight / (float) originalWidth);
        } else if (originalHeight == originalWidth) {
            resizedHeight = maxDimension;
            resizedWidth = maxDimension;
        }
        return Bitmap.createScaledBitmap(bitmap, resizedWidth, resizedHeight, false);
    }

    public static Bitmap rotateImage(String photoPath, Bitmap bitmap) {

        Bitmap rotated = bitmap;
        try {
            Log.d("UTIL", "Rotating image.");

            ExifInterface exif = new ExifInterface(photoPath);
            int orientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);

            int rotation = 0;
            if (orientation == 6) rotation = 90;
            else if (orientation == 3) rotation = 180;
            else if (orientation == 8) rotation = 270;

            if (rotation != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate(rotation);

                rotated = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        } catch (Exception e) {
            Log.d("UTIL", "Could not rotate image.");
        }
        return rotated;
    }
}
