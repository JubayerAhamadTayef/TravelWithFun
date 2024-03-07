package com.example.travelwithfun.Activites;

import static java.lang.Thread.sleep;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travelwithfun.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(3000);

                    Intent i = new Intent(SplashScreenActivity.this, IntroScreenActivity.class);
                    startActivity(i);
                    finish();}catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

}