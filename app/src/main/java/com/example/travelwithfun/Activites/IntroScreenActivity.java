
package com.example.travelwithfun.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.travelwithfun.R;

public class IntroScreenActivity extends AppCompatActivity {
    ConstraintLayout introBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_screen);
introBtn =(ConstraintLayout) findViewById(R.id.introBtn);



    introBtn.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            startActivity(new Intent(IntroScreenActivity.this,MainActivity.class));
        }
    });}

}