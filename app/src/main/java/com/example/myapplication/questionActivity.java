package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.media.AudioManager;
import android.media.MediaPlayer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;





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

       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        playAudio();



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



    private void playAudio() {
       // try {
         MediaPlayer stem = MediaPlayer.create(questionActivity.this, R.raw.man3);


     // MediaPlayer stem = new MediaPlayer();
       // stem.setDataSource("/Desktop/stemVrouw.m4a");
     //   stem.prepare();
        stem.start();

          //  Thread.sleep(5000);
            //ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
            //executorService.schedule(questionActivity:: playAudio, 10, delayInSeconds, TimeUnit.SECONDS);

           // stem.start();
      // } catch (InterruptedException e){
       //   e.printStackTrace();}

/*
        try {
            MediaPlayer stem = new MediaPlayer();
            stem.setDataSource("/storage/emulated/0/zbos_media_library/vrouw3.m4a");
            stem.prepare();
            stem.start();

        }catch (Exception ex){
            ex.printStackTrace();}
*/

    }


}