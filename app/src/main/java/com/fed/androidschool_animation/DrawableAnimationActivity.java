package com.fed.androidschool_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class DrawableAnimationActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_animation);
        mImageView = findViewById(R.id.horse_view);

    }

    @Override
    protected void onStart() {
        super.onStart();
        ((AnimationDrawable)mImageView.getDrawable()).start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        ((AnimationDrawable)mImageView.getDrawable()).stop();
    }
}
