package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;

public class questionActivity extends AppCompatActivity {

    private TextToSpeech TTS;
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




        TTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = TTS.setLanguage(new Locale("nl_NL"));

                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
                        Log.e("TTS", "Language not supported" );}

                }
                else {
                    Log.e("TTS", "Initialization failed" );
                }

            }
        });
             tv. setOnClickListener( new View.OnClickListener(){


                @Override
                public void onClick(View view) {
                    speak();

                }
            });


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


    private void speak(){
        String text = ("Wat leuk! Op welk gebied heb je stage gelopen?");
        float pitch = (float) 1;
        if (pitch < 0.1) pitch = 0.1f;


        float speed = (float) 1;
        if (speed < 0.1) speed = 0.1f;

        TTS.setPitch(pitch);
        TTS.setSpeechRate(speed);
        TTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }

    @Override
    protected void onDestroy() {
        if(TTS != null){
            TTS.stop();
            TTS.shutdown();
        }

        super.onDestroy();
    }
}