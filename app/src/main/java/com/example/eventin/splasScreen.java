package com.example.eventin;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.window.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

public class splasScreen extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run (){
                    startActivity(new Intent(splasScreen.this,MainActivity.class));
                    finish();
                }
            }, 1200);

        }

}
