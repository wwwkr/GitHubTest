package com.rtw181204.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setTitle("Nice");

        //Github에서
        //추가작업
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
