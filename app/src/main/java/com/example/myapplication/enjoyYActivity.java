package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class enjoyYActivity extends AppCompatActivity {

    Button btnY;
    Button btnN;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enjoy_yactivity);

        btnY = findViewById(R.id.buttonYes);
        btnN = findViewById(R.id.buttonNo);
        tv = findViewById(R.id.textViewQuestion);


        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(enjoyYActivity.this, funYActivity.class));
            }
        });

        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(enjoyYActivity.this, funNActivity.class));
            }
        });
    }



}