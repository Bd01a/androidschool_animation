package com.fed.androidschool_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class ValueAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animation);

        final ImageView imageView = findViewById(R.id.imageView_horse);


        ValueAnimator alphaAnimator = ValueAnimator.ofFloat(0f,1f);
        configurateAnimation(alphaAnimator);
        alphaAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                imageView.setAlpha(((float)valueAnimator.getAnimatedValue()));
            }
        });
        alphaAnimator.start();

        float length = (-1f)*getResources().getDimension(R.dimen.y_length);
        ValueAnimator translationYAnimator = ValueAnimator.ofFloat(0f,length);
        configurateAnimation(translationYAnimator);
        translationYAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                imageView.setTranslationY((float)(valueAnimator.getAnimatedValue()));
            }
        });
        translationYAnimator.start();
    }

    private void configurateAnimation(ValueAnimator animator) {
        animator.setRepeatCount(50);
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.setDuration(800);
    }
}
