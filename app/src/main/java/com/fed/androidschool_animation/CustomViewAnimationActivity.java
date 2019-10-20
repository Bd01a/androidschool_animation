package com.fed.androidschool_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class CustomViewAnimationActivity extends AppCompatActivity {

    private ObjectAnimator mProgressAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_animation);

        me.akudryavtsev.customview.FinanceProgressView financeProgressView = findViewById(R.id.finance_progress_view);
        mProgressAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.finance_progress_animation);
        mProgressAnimator.setTarget(financeProgressView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mProgressAnimator.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mProgressAnimator.end();
    }
}
