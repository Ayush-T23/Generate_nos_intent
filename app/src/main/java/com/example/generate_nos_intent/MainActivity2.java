package com.example.generate_nos_intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private TextView randomNumberTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);


            randomNumberTextView = findViewById(R.id.random_number_text_view);

            Intent intent = getIntent();
            int randomNumber = intent.getIntExtra("randomNumber", 0);

            randomNumberTextView.setText("Random Number: " + randomNumber);
        }
    }
