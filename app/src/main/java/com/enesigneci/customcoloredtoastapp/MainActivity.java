package com.enesigneci.customcoloredtoastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.enesigneci.customcoloredtoastlibrary.CustomColoredToast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomColoredToast.makeCustomColoredToast(MainActivity.this,"Custom Toast",CustomColoredToast.LENGTH_LONG,"#FF0000");
    }
}