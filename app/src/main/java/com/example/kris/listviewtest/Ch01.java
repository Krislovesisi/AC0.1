package com.example.kris.listviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by 38348 on 2017/7/18.
 */

public class Ch01 extends Activity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch01layout);
        imageView = (ImageView) findViewById(R.id.image_ch01);
    }

}
