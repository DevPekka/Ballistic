package com.devpekka.jsonpart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Photoshop2 extends AppCompatActivity {
    ImageView mImageV;
    ImageView mImageV2;
    ImageView mImageV3;
    ImageView mImageV4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photoshop2);

        getSupportActionBar().setTitle("How to Make Letter Press effect");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mImageV = findViewById(R.id.imageV_2); // Doom Thumbnail
        mImageV2 = findViewById(R.id.imageV_3); // Material 1 Thumbnail
        mImageV3 = findViewById(R.id.imageV_4); // Material 2 Thumbnail
        mImageV4 = findViewById(R.id.imageV_5); // Material 2 Thumbnail

        //Doom Thumbnail
        Picasso.with(getApplicationContext()).load("https://i.imgur.com/7q0ATw3.jpg")
                .into(mImageV);

        //Material 1 Thumbnail
        Picasso.with(getApplicationContext()).load("https://i.imgur.com/gVNnbLR.jpg")
                .into(mImageV2);

        // Material 2 Thumbnail
        Picasso.with(getApplicationContext()).load("https://i.imgur.com/Bi4kdtS.jpg")
                .into(mImageV3);

        // Material 2 Thumbnail
        Picasso.with(getApplicationContext()).load("https://i.imgur.com/7q0ATw3.jpg")
                .into(mImageV4);
    }
}
