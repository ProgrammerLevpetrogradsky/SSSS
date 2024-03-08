package com.isac.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assuming you have an ImageView in your layout file
        imageView = findViewById(R.id.imageView);

        // Create TranslateAnimation (fromXDelta, toXDelta, fromYDelta, toYDelta)
        animation = new TranslateAnimation(0, 500, 0, 0);
        animation.setDuration(3000); // 3 seconds for the animation to complete
        animation.setFillAfter(true); // Keeps the final position after the animation

        // Set AnimationListener if needed
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                // Animation ended, you can perform any necessary action here
            }

            @Override
            public void onAnimationRepeat(Animation animation) {}
        });

        // Start animation
        imageView.startAnimation(animation);
    }
}
