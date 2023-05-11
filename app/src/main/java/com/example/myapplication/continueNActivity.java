package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class continueNActivity extends AppCompatActivity {
    Button btnB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_nactivity);

        btnB = findViewById(R.id.buttonNo);
        playAudio();



        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(continueNActivity.this, talkActivity.class));
            }
        });
    }



    private void playAudio() {
        // try {
       MediaPlayer stem = MediaPlayer.create(continueNActivity.this, R.raw.man9);
       stem.start();

      /*  try {
            MediaPlayer stem = new MediaPlayer();
            stem.setDataSource("/storage/emulated/0/zbos_media_library/vrouw9.m4a");
            stem.prepare();
            stem.start();

        }catch (Exception ex){
            ex.printStackTrace();}
*/
    }
}