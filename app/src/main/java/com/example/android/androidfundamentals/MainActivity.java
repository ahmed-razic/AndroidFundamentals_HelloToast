package com.example.android.androidfundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);

        countUp(mShowCount);

        Log.i("MainActivity", "This is a I message");
        Log.d("MainActivity", "This is a D message");
        Log.w("MainActivity", "This is a E message");
        Log.e("MainActivity", "This is a W message");
    }

    public void showHello(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("KEY", mCount);
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        if(view != null){
            mShowCount.setText(String.valueOf(mCount));
        }
    }
}