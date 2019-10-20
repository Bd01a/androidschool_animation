package com.fed.androidschool_animation;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handleClick(R.id.btn_drawable_animation, DrawableAnimationActivity.class);
        handleClick(R.id.btn_view_animation, ViewAnimationActivity.class);
        handleClick(R.id.btn_value_animation, ValueAnimationActivity.class);
        handleClick(R.id.btn_obj_animation, ObjectAnimaionActivity.class);
        handleClick(R.id.btn_custom_view_animation, CustomViewAnimationActivity.class);
    }

    private void handleClick(@IdRes int viewId, final Class<? extends Activity> activityClass) {
        findViewById(viewId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, activityClass));
            }
        });
    }
}
