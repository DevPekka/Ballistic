package com.devpekka.jsonpart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Photoshop3 extends AppCompatActivity {
    ImageView mImageV;
    ImageView mImageV2;
    ImageView mImageV3;
    ImageView mImageV4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photoshop3);

        getSupportActionBar().setTitle("Color Grading");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mImageV = findViewById(R.id.imageV_2);
        mImageV2 = findViewById(R.id.imageV_2_2);
        mImageV3 = findViewById(R.id.imageV_4_2);
        mImageV4 = findViewById(R.id.imageV_5_2);

        //Before
        Picasso.with(getApplicationContext()).load("https://i.imgur.com/0W3EMde.jpg")
                .into(mImageV);
        //After
        Picasso.with(getApplicationContext()).load("https://i.imgur.com/s2geT8I.jpg")
                .into(mImageV2);

        //Camera Raw Filter
        Picasso.with(getApplicationContext()).load("https://i.imgur.com/wgdDf9s.jpg")
                .into(mImageV3);

        //Example temperature
        Picasso.with(getApplicationContext()).load("https://i.imgur.com/SmqQIsh.jpg")
                .into(mImageV4);
    }
}
