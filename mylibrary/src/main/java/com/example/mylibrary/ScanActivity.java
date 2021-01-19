package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;

public class ScanActivity extends AppCompatActivity {

    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        ratingBar = findViewById(R.id.ratingBar);

    }

    public void setRatingBar(float rating){
        ratingBar.setRating(rating);
    }
}