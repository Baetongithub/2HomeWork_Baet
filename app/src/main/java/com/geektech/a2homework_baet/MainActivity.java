package com.geektech.a2homework_baet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String KEY = "key";
    public static String TAG = "tag";

    private EditText editText;
    private EditText editText2;
    private EditText editText3;
    private TextView textView;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate " + total);
        editText = findViewById(R.id.etTextFirst);
        editText2 = findViewById(R.id.etTextSecond);
        editText3 = findViewById(R.id.etTextThird);
        textView = findViewById(R.id.textView);

    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view) {

        int num1 = Integer.parseInt(editText.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());
        int num3 = Integer.parseInt(editText3.getText().toString());
        total = num1 + num2 / num3;

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY, total);
        Log.d(TAG, "onSaveInstanceState " + total);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        total = savedInstanceState.getInt(KEY);
        textView.setText(String.valueOf(total));
        Log.d(TAG, "onRestoreInstanceState " + total);
    }
}