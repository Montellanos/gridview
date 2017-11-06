package com.factorybyte.scrollview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageDetailActivity extends AppCompatActivity {

    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_detail);

        image = (ImageView) findViewById(R.id.imageView);


        Intent intent = getIntent();

        image.setImageResource(intent.getIntExtra("image", 0));


    }
}
