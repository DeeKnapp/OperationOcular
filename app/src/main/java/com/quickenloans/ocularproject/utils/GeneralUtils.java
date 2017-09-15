package com.quickenloans.ocularproject.utils;

import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by ctan on 9/11/17.
 */

public class GeneralUtils {

    public static void showSnackbar(Activity activity, final String text) {
        View container = activity.findViewById(android.R.id.content);
        if (container != null) {
            Snackbar.make(container, text, Snackbar.LENGTH_LONG).show();
        }
    }

    public static void showSnackbar(final Activity activity, final int mainTextStringId, final int actionStringId,
                                    View.OnClickListener listener) {
        Snackbar.make(activity.findViewById(android.R.id.content),
                activity.getString(mainTextStringId),
                Snackbar.LENGTH_INDEFINITE)
                .setAction(activity.getString(actionStringId), listener).show();
    }
}
