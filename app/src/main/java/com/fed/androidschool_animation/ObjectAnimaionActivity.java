package com.fed.androidschool_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class ObjectAnimaionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animaion);

        ImageView imageView = findViewById(R.id.image);
        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(imageView, "scaleX",0.5f,0.7f,0.5f,1f);
        ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(imageView, "scaleY",0.5f,0.7f,0.5f,1f);
        configurate(scaleXAnimator).start();
        configurate(scaleYAnimator).start();
    }



    private Animator configurate(ObjectAnimator animator) {
        animator.setDuration(1000);
        animator.setRepeatCount(30);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        return animator;
    }
}
