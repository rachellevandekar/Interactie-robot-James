package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class enjoyActivity extends AppCompatActivity {


    Button btnY;
    Button btnN;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enjoy);

        btnY = findViewById(R.id.buttonYes);
        btnN = findViewById(R.id.buttonNo);
        tv = findViewById(R.id.textViewQuestion);


        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(enjoyActivity.this, enjoyYActivity.class));
            }
        });

        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(enjoyActivity.this, enjoyNActivity.class));
            }
        });
    }
}