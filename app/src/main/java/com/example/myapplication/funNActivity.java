package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class funNActivity extends AppCompatActivity {


    Button btnB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_nactivity);



    btnB = findViewById(R.id.buttonNo);


    playAudio();



        btnB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(funNActivity.this, talkActivity.class));
        }
    });

}

    private void playAudio() {
        // try {
        MediaPlayer stem = MediaPlayer.create(funNActivity.this, R.raw.man7);
      stem.start();

/*
        try {
            MediaPlayer stem = new MediaPlayer();
            stem.setDataSource("/storage/emulated/0/zbos_media_library/vrouw7.m4a");
            stem.prepare();
            stem.start();

        }catch (Exception ex){
            ex.printStackTrace();}
*/
    }


}