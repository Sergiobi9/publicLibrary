package com.example.frameworktesting;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mylibrary.ScanLayout;

public class MainActivity extends AppCompatActivity {

    private ScanLayout scanLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scanLayout = findViewById(R.id.scan_layout);
        String URL = "https://www.mindfood.com/wp-content/themes/mindfood-theme/timthumb.php?src=/wp-content/uploads/2019/12/GettyImages-883186292-1.jpg&w=700&h=700&zc=1";
        scanLayout.setUrlImage(URL, ImageView.ScaleType.CENTER_CROP);

    }
}