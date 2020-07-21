package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.d("LifecycleActivity", "------onCreate-------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifecycleActivity", "------onStart-------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifecycleActivity", "------onResume-------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifecycleActivity", "------onPause-------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifecycleActivity", "------onStop-------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifecycleActivity", "------onDestroy-------");
    }
}