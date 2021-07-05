package com.example.multiple_screens_appjava;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondPage extends AppCompatActivity {
    Button nextPageButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        nextPageButton = findViewById(R.id.button2);
        backButton = findViewById(R.id.button3);

        nextPageButton.setOnClickListener(v -> {
            Intent intent = new Intent(SecondPage.this, ThirdPage.class);
            startActivity(intent);
        });

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(SecondPage.this, MainActivity.class);
            startActivity(intent);
        });
    }
}