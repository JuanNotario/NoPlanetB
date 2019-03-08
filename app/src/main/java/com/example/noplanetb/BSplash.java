package com.example.noplanetb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.mikhaellopez.circularimageview.CircularImageView;

public class BSplash extends AppCompatActivity {

    CircularImageView ivCohete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsplash);

        ivCohete = findViewById(R.id.ivCohete);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.slideup);

        ivCohete.startAnimation(myanim);
        openApp(true);
    }

    private void openApp(boolean b) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSplash.this, BLogin.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
