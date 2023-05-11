package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
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

        playAudio();

        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(enjoyYActivity.this, continueYActivity.class));
            }
        });

        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(enjoyYActivity.this, continueNActivity.class));
            }
        });
    }

    private void playAudio() {
        // try {
        MediaPlayer stem = MediaPlayer.create(enjoyYActivity.this, R.raw.man8);
        stem.start();

      /*
        try {
            MediaPlayer stem = new MediaPlayer();
            stem.setDataSource("/storage/emulated//raw/vrouw8.m4a");
            stem.prepare();
            stem.start();

        }catch (Exception ex){
            ex.printStackTrace();}

       */


    }


}