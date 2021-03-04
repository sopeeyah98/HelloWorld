package com.example.helloworld;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    private TextView textView_joke;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);

        textView_joke = findViewById(R.id.textView_joke);
        //Intent intent = getIntent();
        textView_joke.setText(sharedPreferences.getString("joke","") + "\ncount is " +
                getSharedPreferences("count",0));
        // unpack the intent
        // put the joke into the text view
    }
}
