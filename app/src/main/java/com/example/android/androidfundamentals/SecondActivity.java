package com.example.android.androidfundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        TextView countTextView = findViewById(R.id.count_textView);
        int count = intent.getIntExtra("KEY", 0);

        countTextView.setText(String.valueOf(count));
    }
}