package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class continueYActivity extends AppCompatActivity {
    Button btnB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_yactivity);




        btnB = findViewById(R.id.buttonNo);
        playAudio();



        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(continueYActivity.this, talkActivity.class));
            }
        });
    }



    private void playAudio() {
        // try {
        MediaPlayer stem = MediaPlayer.create(continueYActivity.this, R.raw.man10);
       stem.start();

       /* try {
            MediaPlayer stem = new MediaPlayer();
            stem.setDataSource("/storage/emulated/0/zbos_media_library/vrouw10.m4a");
            stem.prepare();
            stem.start();

        }catch (Exception ex){
            ex.printStackTrace();}*/

    }

}