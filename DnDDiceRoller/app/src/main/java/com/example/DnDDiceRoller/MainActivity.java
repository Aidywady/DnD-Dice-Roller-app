package com.example.DnDDiceRoller;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    RadioButton attack,saveOrAbility, other, regular, advantage, disadvantage;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Text1 = findViewById(R.id.NumberOfRolls);
        EditText Text2 = findViewById(R.id.NumberOfSides);

        TextView d4TextModifier = findViewById(R.id.d4Modifier);
        TextView d6TextModifier = findViewById(R.id.d6Modifier);
        TextView d8TextModifier = findViewById(R.id.d8Modifier);
        TextView d10TextModifier = findViewById(R.id.d10Modifier);
        TextView d12TextModifier = findViewById(R.id.d12Modifier);
        TextView d20TextModifier = findViewById(R.id.d20Modifier);
        TextView d100TextModifier = findViewById(R.id.d100Modifier);

        attack = findViewById(R.id.attack);
        saveOrAbility = findViewById(R.id.SaveOrAbility);
        other = findViewById(R.id.other);
        regular = findViewById(R.id.regular);
        advantage = findViewById(R.id.advantage);
        disadvantage = findViewById(R.id.disadvantage);
        radioGroup = findViewById(R.id.RadioGroup1);
        KeyListener listener = Text1.getKeyListener();

        ColorStateList colorStateList = new ColorStateList(
                new int[][]{
                        new int[]{-android.R.attr.state_checked},
                        new int[]{android.R.attr.state_checked}
                },
                new int[]{

                        Color.argb(128, 0, 0, 0)
                        , Color.argb(255, 255, 198, 7),
                }
        );

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {


            if (attack.isChecked()) {
                Text1.setText(R.string.auto_fill_in_no_of_rolls);
                Text2.setText(R.string.auto_fill_in_no_of_sides);
                Text1.setFocusableInTouchMode(false);
                Text1.setKeyListener(null);
                Text2.setFocusableInTouchMode(false);
                Text2.setKeyListener(null);
                Text1.setTextColor(ColorStateList.valueOf(Color.GRAY));
                Text2.setTextColor(ColorStateList.valueOf(Color.GRAY));
                regular.setButtonTintList(colorStateList);
                regular.setClickable(true);
                advantage.setClickable(true);
                disadvantage.setClickable(true);
            } else if (saveOrAbility.isChecked()) {
                Text1.setText(R.string.auto_fill_in_no_of_rolls);
                Text2.setText(R.string.auto_fill_in_no_of_sides);
                Text1.setFocusableInTouchMode(false);
                Text1.setKeyListener(null);
                Text2.setFocusableInTouchMode(false);
                Text2.setKeyListener(null);
                Text1.setTextColor(ColorStateList.valueOf(Color.GRAY));
                Text2.setTextColor(ColorStateList.valueOf(Color.GRAY));
                regular.setButtonTintList(colorStateList);
                regular.setClickable(true);
                advantage.setClickable(true);
                disadvantage.setClickable(true);
            } else if (other.isChecked()) {
                Text1.setText("");
                Text2.setText("");
                Text1.setFocusableInTouchMode(true);
                Text1.setKeyListener(listener);
                Text2.setFocusableInTouchMode(true);
                Text2.setKeyListener(listener);
                Text1.setTextColor(ColorStateList.valueOf(Color.BLACK));
                Text2.setTextColor(ColorStateList.valueOf(Color.BLACK));
                regular.setButtonTintList(ColorStateList.valueOf(Color.argb(128, 0, 0, 0)));
                regular.setChecked(true);
                regular.setClickable(false);
                advantage.setClickable(false);
                disadvantage.setClickable(false);
            }


        });

        SeekBar d4seekBar = findViewById(R.id.d4SeekBar);

        d4seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                d4TextModifier.setText("+ " + progress + "d4 modifier");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        SeekBar d6seekBar = findViewById(R.id.d6SeekBar);

        d6seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                d6TextModifier.setText("+ " + progress + "d6 modifier");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        SeekBar d8seekBar = findViewById(R.id.d8SeekBar);

        d8seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                d8TextModifier.setText("+ " + progress + "d8 modifier");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        SeekBar d10seekBar = findViewById(R.id.d10SeekBar);

        d10seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                d10TextModifier.setText("+ " + progress + "d10 modifier");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        SeekBar d12seekBar = findViewById(R.id.d12SeekBar);

        d12seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                d12TextModifier.setText("+ " + progress + "d12 modifier");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        SeekBar d20seekBar = findViewById(R.id.d20SeekBar);

        d20seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                d20TextModifier.setText("+ " + progress + "d20 modifier");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        SeekBar d100seekBar = findViewById(R.id.d100SeekBar);

        d100seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                d100TextModifier.setText("+ " + progress + "d100 modifier");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if ( v instanceof EditText) {
                Rect outRect = new Rect();
                v.getGlobalVisibleRect(outRect);
                if (!outRect.contains((int)event.getRawX(), (int)event.getRawY())) {
                    v.clearFocus();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent( event );
    }

    int FinalRoll, d4Roll, d6Roll, d8Roll, d10Roll, d12Roll, d20Roll, d100Roll, Rolls, Sides, Modifier;
    String d4info, d6info, d8info, d10info, d12info, d20info, d100info;

    public void calculateRoll(View view) {
        Intent intent = new Intent(this, Result.class);

        EditText Text1 = findViewById(R.id.NumberOfRolls);
        EditText Text2 = findViewById(R.id.NumberOfSides);
        EditText Text3 = findViewById(R.id.Modifier);



        SeekBar d4seekBar = findViewById(R.id.d4SeekBar);
        SeekBar d6seekBar = findViewById(R.id.d6SeekBar);
        SeekBar d8seekBar = findViewById(R.id.d8SeekBar);
        SeekBar d10seekBar = findViewById(R.id.d10SeekBar);
        SeekBar d12seekBar = findViewById(R.id.d12SeekBar);
        SeekBar d20seekBar = findViewById(R.id.d20SeekBar);
        SeekBar d100seekBar = findViewById(R.id.d100SeekBar);

        final Random myRandom = new Random();



        try {
            Rolls = Integer.parseInt(Text1.getText().toString());
        } catch (Exception e) {
            Rolls = 1;
        }
        try {
            Sides = Integer.parseInt(Text2.getText().toString());
        } catch (Exception e) {
            Sides = 20;
        }
        try {
            Modifier = Integer.parseInt(Text3.getText().toString());
        } catch (Exception e) {
            Modifier = 0;
        }

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> d4list = new ArrayList<>();
        ArrayList<String> d6list = new ArrayList<>();
        ArrayList<String> d8list = new ArrayList<>();
        ArrayList<String> d10list = new ArrayList<>();
        ArrayList<String> d12list = new ArrayList<>();
        ArrayList<String> d20list = new ArrayList<>();
        ArrayList<String> d100list = new ArrayList<>();


        for(int i = 0; i < Rolls; i++) {
            if(regular.isChecked()) {
                int num = (myRandom.nextInt(Sides) + 1);
                FinalRoll += num;
                list.add(String.valueOf(num));

            }
            else {
                int num1 = (myRandom.nextInt(Sides) + 1);
                int num2 = (myRandom.nextInt(Sides) + 1);
                int finalNum = 0;
                if(advantage.isChecked() && num1 >= num2) finalNum = num1;
                else if(disadvantage.isChecked() && num1 >= num2) finalNum = num2;
                else if(advantage.isChecked() && num1 < num2) finalNum = num2;
                else if(disadvantage.isChecked() && num1 < num2) finalNum = num1;
                FinalRoll += finalNum; 
                list.add((finalNum + " (" + num1 + ", " + num2 + ")"));
            }
        }

        if(d4seekBar.getProgress() > 0) {
            for(int i = 0; i < d4seekBar.getProgress(); i++) {
                int num = (myRandom.nextInt(4) + 1);
                d4Roll += num;
                d4list.add(String.valueOf(num));
            }
            d4info = (" + " + d4seekBar.getProgress() + "d4 " + d4list);
        }
        else d4info = "";

        if(d6seekBar.getProgress() > 0) {
            for(int i = 0; i < d6seekBar.getProgress(); i++) {
                int num = (myRandom.nextInt(6) + 1);
                d6Roll += num;
                d6list.add(String.valueOf(num));
            }
            d6info = (" + " + d6seekBar.getProgress() + "d6 " + d6list);
        }
        else d6info = "";

        if(d8seekBar.getProgress() > 0) {
            for(int i = 0; i < d8seekBar.getProgress(); i++) {
                int num = (myRandom.nextInt(8) + 1);
                d8Roll += num;
                d8list.add(String.valueOf(num));
            }
            d8info = (" + " + d8seekBar.getProgress() + "d8 " + d8list);
        }
        else d8info = "";

        if(d10seekBar.getProgress() > 0) {
            for(int i = 0; i < d10seekBar.getProgress(); i++) {
                int num = (myRandom.nextInt(10) + 1);
                d10Roll += num;
                d10list.add(String.valueOf(num));
            }
            d10info = (" + " + d10seekBar.getProgress() + "d10 " + d10list);
        }
        else d10info = "";

        if(d12seekBar.getProgress() > 0) {
            for(int i = 0; i < d12seekBar.getProgress(); i++) {
                int num = (myRandom.nextInt(12) + 1);
                d12Roll += num;
                d12list.add(String.valueOf(num));
            }
            d12info = (" + " + d12seekBar.getProgress() + "d12 " + d12list);
        }
        else d12info = "";

        if(d20seekBar.getProgress() > 0) {
            for(int i = 0; i < d20seekBar.getProgress(); i++) {
                int num = (myRandom.nextInt(20) + 1);
                d20Roll += num;
                d20list.add(String.valueOf(num));
            }
            d20info = (" + " + d20seekBar.getProgress() + "d20 " + d20list);
        }
        else d20info = "";

        if(d100seekBar.getProgress() > 0) {
            for(int i = 0; i < d100seekBar.getProgress(); i++) {
                int num = (myRandom.nextInt(100) + 1);
                d100Roll += num;
                d100list.add(String.valueOf(num));
            }
            d100info = (" + " + d100seekBar.getProgress() + "d100 " + d100list);
        }
        else d100info = "";

        if(FinalRoll == 20 && attack.isChecked()) {
            intent.putExtra("key0", "Natural 20!");
            intent.putExtra("key1", (Rolls + "d" + Sides + " " + list + " + " + Modifier + d4info + d6info + d8info + d10info + d12info + d20info + d100info));
        }
        else if(FinalRoll == 1 && attack.isChecked()) {
            intent.putExtra("key0", "Automatic fail!");
            intent.putExtra("key1", (Rolls + "d" + Sides + " " + list + " + " + Modifier + d4info + d6info + d8info + d10info + d12info + d20info + d100info));
        }
        else {
            FinalRoll += (Modifier + d4Roll + d6Roll + d8Roll + d10Roll + d12Roll + d20Roll + d100Roll);
            intent.putExtra("key0", String.valueOf(FinalRoll));
            intent.putExtra("key1", (Rolls + "d" + Sides + " " + list + " + " + Modifier + d4info + d6info + d8info + d10info + d12info + d20info + d100info));
        }
        startActivity(intent);
    }
    public void openCalculator(View view) {
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }
}