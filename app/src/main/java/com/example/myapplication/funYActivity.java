package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class funYActivity extends AppCompatActivity {

    Button btnY;
    Button btnN;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_yactivity);



        btnN = findViewById(R.id.buttonNo);
     
        playAudio();




        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(funYActivity.this, talkActivity.class));
            }
        });
    }

    private void playAudio() {
        // try {
       MediaPlayer stem = MediaPlayer.create(funYActivity.this, R.raw.man6);
       stem.start();
/*
        try {
            MediaPlayer stem = new MediaPlayer();
            stem.setDataSource("/storage/emulated/0/zbos_media_library/vrouw6.m4a");
            stem.prepare();
            stem.start();

        }catch (Exception ex){
            ex.printStackTrace();}
*/
    }

}