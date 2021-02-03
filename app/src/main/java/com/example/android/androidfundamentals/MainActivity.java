package com.example.android.androidfundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MainActivity", "This is a I message");
/*        Log.d("MainActivity", "This is a D message");
        Log.w("MainActivity", "This is a E message");
        Log.e("MainActivity", "This is a W message");*/
    }
}