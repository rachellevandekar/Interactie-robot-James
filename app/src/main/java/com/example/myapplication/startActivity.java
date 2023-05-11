package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class startActivity extends AppCompatActivity {

    Button btnN;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        iv = findViewById(R.id.imageView);


        iv.setOnClickListener ( new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                playAudio();
            }
        });



        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(startActivity.this, talkActivity.class));
            }
        });


    }

    private void playAudio() {
        // try {
       MediaPlayer stem = MediaPlayer.create(startActivity.this, R.raw.man1);
       stem.start();

    /*    try {
            MediaPlayer stem = new MediaPlayer();
            stem.setDataSource("/storage/emulated/0/zbos_media_library/vrouw1.m4a");
            stem.prepare();
            stem.start();

        }catch (Exception ex){
            ex.printStackTrace();}
*/
    }


}