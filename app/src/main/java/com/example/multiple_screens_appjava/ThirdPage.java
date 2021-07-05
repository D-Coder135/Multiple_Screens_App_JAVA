package com.example.multiple_screens_appjava;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdPage extends AppCompatActivity {
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
        backButton = findViewById(R.id.button4);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(ThirdPage.this, MainActivity.class);
            startActivity(intent);
        });
    }
}