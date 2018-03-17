package com.devpekka.jsonpart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Photoshop extends AppCompatActivity {
    ImageView mImageV;
    ImageView mImageV2;
    ImageView mImageV3;
    ImageView mImageV4;
    ImageView mImageV5;
    ImageView mImageV6;
    ImageView mImageV7;
    ImageView mImageV8;
    ImageView mImageV9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photoshop);

        getSupportActionBar().setTitle("How to Make 3D Text");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Resource for Image
        mImageV = findViewById(R.id.imageV); // Doom Thumbnail
        mImageV2 = findViewById(R.id.mat1); // Material 1 Thumbnail
        mImageV3 = findViewById(R.id.mat2); // Material 2 Thumbnail
        mImageV4 = findViewById(R.id.mat3); // Material 3 Thumbnail
        mImageV5 = findViewById(R.id.mat4); // Material 4 Thumbnail
        mImageV6 = findViewById(R.id.mat5); // Material 5 Thumbnail
        mImageV7 = findViewById(R.id.mat6); // Material 6 Thumbnail
        mImageV8 = findViewById(R.id.mat7); // Material 7 Thumbnail
        mImageV9 = findViewById(R.id.mat8); // Material 8 Thumbnail

        //Doom Thumbnail
        Picasso.with(getApplicationContext()).load("https://99designs-blog.imgix.net/blog/wp-content/uploads/2013/02/07.jpg")
                .into(mImageV);

        //Material 1 Thumbnail
        Picasso.with(getApplicationContext()).load("https://99designs-blog.imgix.net/blog/wp-content/uploads/2013/02/material-1.jpg")
                .into(mImageV2);

        // Material 2 Thumbnail
        Picasso.with(getApplicationContext()).load("https://99designs-blog.imgix.net/blog/wp-content/uploads/2013/02/material-2.jpg")
                .into(mImageV3);

        // Material 3 Thumbnail
        Picasso.with(getApplicationContext()).load("https://99designs-blog.imgix.net/blog/wp-content/uploads/2013/02/01.jpg")
                .into(mImageV4);

        // Material 4 Thumbnail
        Picasso.with(getApplicationContext()).load("https://99designs-blog.imgix.net/blog/wp-content/uploads/2013/02/02.jpg")
                .into(mImageV5);

        // Material 5 Thumbnail
        Picasso.with(getApplicationContext()).load("https://99designs-blog.imgix.net/blog/wp-content/uploads/2013/02/03.jpg")
                .into(mImageV6);

        // Material 6 Thumbnail
        Picasso.with(getApplicationContext()).load("https://99designs-blog.imgix.net/blog/wp-content/uploads/2013/02/04.jpg")
                .into(mImageV7);

        // Material 7 Thumbnail
        Picasso.with(getApplicationContext()).load("https://99designs-blog.imgix.net/blog/wp-content/uploads/2013/02/05.jpg")
                .into(mImageV8);

        // Material 7 Thumbnail
        Picasso.with(getApplicationContext()).load("https://99designs-blog.imgix.net/blog/wp-content/uploads/2013/02/06.jpg")
                .into(mImageV9);
    }
}
