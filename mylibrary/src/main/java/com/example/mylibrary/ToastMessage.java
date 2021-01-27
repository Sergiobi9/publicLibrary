package com.example.mylibrary;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

class ToastMessage {

    private final String MESSAGE = "HELLO DUDE";

    void showToast(Context context){
        showMesage(context);
    }

    private void showMesage(Context context){
        Toast.makeText(context, MESSAGE, Toast.LENGTH_LONG).show();
    }
}
