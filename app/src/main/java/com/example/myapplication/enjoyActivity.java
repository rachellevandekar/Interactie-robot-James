package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
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

        playAudio();

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


    private void playAudio() {
        // try {
       MediaPlayer stem = MediaPlayer.create(enjoyActivity.this, R.raw.man4);
      stem.start();
/*
        try {
            MediaPlayer stem = new MediaPlayer();
            stem.setDataSource("/storage/emulated/0/zbos_media_library/vrouw4.m4a");
            stem.prepare();
            stem.start();

        }catch (Exception ex){
//            ex.printStackTrace();}

 */
    }

}