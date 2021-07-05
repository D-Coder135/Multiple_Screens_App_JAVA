package com.example.multiple_screens_appjava;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button nextPageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextPageButton = findViewById(R.id.button);

        nextPageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondPage.class);
            startActivity(intent);
        });
    }
}