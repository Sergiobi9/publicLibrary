package com.example.mylibrary;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

class ToastMessage {

    protected static void showToast(Activity activity, String message){
        ActivityCompat.requestPermissions(activity,
                new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                1);
    }
}
