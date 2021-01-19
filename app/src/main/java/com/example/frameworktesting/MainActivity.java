package com.example.frameworktesting;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mylibrary.ScanLayout;
import com.example.mylibrary.ToastMessage;

public class MainActivity extends AppCompatActivity {

    private ScanLayout scanLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scanLayout = findViewById(R.id.scan_layout);
        String URL = "https://static.wikia.nocookie.net/suits/images/d/da/S8_Harvey_Specter.jpg/revision/latest?cb=20180731195449";
        scanLayout.setUrlImage(URL, ImageView.ScaleType.CENTER_CROP);

        ToastMessage.showToast(this, "hola");
    }
}