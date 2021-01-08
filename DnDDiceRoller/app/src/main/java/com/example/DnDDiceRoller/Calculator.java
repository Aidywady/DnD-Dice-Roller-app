package com.example.DnDDiceRoller;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }



    public void addition(View view) {
        TextView answer = findViewById(R.id.Answer);
        EditText text1 = findViewById(R.id.Number1);
        EditText text2 = findViewById(R.id.Number2);
        int number1, number2;

        try {
            number1 = Integer.parseInt(text1.getText().toString());
        } catch (Exception e) {
            number1 = 0;
        }
        try {
            number2 = Integer.parseInt(text2.getText().toString());
        } catch (Exception e) {
            number2 = 0;
        }
        answer.setText(String.valueOf(number1 + number2));
    }
    public void subtraction(View view) {
        TextView answer = findViewById(R.id.Answer);
        EditText text1 = findViewById(R.id.Number1);
        EditText text2 = findViewById(R.id.Number2);
        int number1, number2;

        try {
            number1 = Integer.parseInt(text1.getText().toString());
        } catch (Exception e) {
            number1 = 0;
        }
        try {
            number2 = Integer.parseInt(text2.getText().toString());
        } catch (Exception e) {
            number2 = 0;
        }
        answer.setText(String.valueOf(number1 - number2));
    }
    public void multiplication(View view) {
        TextView answer = findViewById(R.id.Answer);
        EditText text1 = findViewById(R.id.Number1);
        EditText text2 = findViewById(R.id.Number2);
        int number1, number2;

        try {
            number1 = Integer.parseInt(text1.getText().toString());
        } catch (Exception e) {
            number1 = 0;
        }
        try {
            number2 = Integer.parseInt(text2.getText().toString());
        } catch (Exception e) {
            number2 = 0;
        }
        answer.setText(String.valueOf(number1 * number2));
    }
    public void division(View view) {
        TextView answer = findViewById(R.id.Answer);
        EditText text1 = findViewById(R.id.Number1);
        EditText text2 = findViewById(R.id.Number2);
        int number1, number2;

        try {
            number1 = Integer.parseInt(text1.getText().toString());
        } catch (Exception e) {
            number1 = 0;
        }
        try {
            number2 = Integer.parseInt(text2.getText().toString());
        } catch (Exception e) {
            number2 = 1;
        }
        answer.setText(String.valueOf(number1 / number2));
    }
}