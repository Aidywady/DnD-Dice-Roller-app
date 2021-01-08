package com.example.DnDDiceRoller;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String FinalResult = getIntent().getStringExtra("key0");
        String RollInfo = getIntent().getStringExtra("key1");


        TextView textView = findViewById(R.id.Result);
        TextView textView2 = findViewById(R.id.Sum);
        textView.setText(FinalResult);
        textView2.setText(RollInfo);
    }
}