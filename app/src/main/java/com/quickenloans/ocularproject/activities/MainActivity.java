package com.quickenloans.ocularproject.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.quickenloans.ocularproject.R;

public class MainActivity extends AppCompatActivity {

    Context context = this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void useCamera(View view) {
        Intent i = new Intent(context, CameraActivity.class);
        startActivity(i);
    }

    public void useMap(View view) {
        Intent i = new Intent(context, MapActivity.class);
        startActivity(i);
    }

    public void viewHistory(View view) {
        Intent i = new Intent(context, SavedSearchActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}