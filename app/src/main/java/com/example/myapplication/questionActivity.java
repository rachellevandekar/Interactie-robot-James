package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class questionActivity extends AppCompatActivity {


    Button btnI;
    Button btnID;
    Button btnHI;
    Button btnS;
    Button btnOP;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        btnI = findViewById(R.id.buttonI);
        btnID = findViewById(R.id.buttonID);
        btnHI = findViewById(R.id.buttonHI);
        btnS = findViewById(R.id.buttonS);
        btnOP = findViewById(R.id.buttonOP);
        tv = findViewById(R.id.textViewQuestion);


        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(questionActivity.this, enjoyActivity.class));
            }
        });

        btnID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(questionActivity.this, enjoyActivity.class));
            }
        });

        btnHI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(questionActivity.this, enjoyActivity.class));
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(questionActivity.this, enjoyActivity.class));
            }
        });

        btnOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(questionActivity.this, enjoyActivity.class));
            }
        });


    }
}