package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.speech.tts.TextToSpeech;
import android.widget.Toast;



import org.w3c.dom.Text;

import java.util.Locale;



public class talkActivity extends AppCompatActivity {
    private TextToSpeech TTS;


    Button btnY;
    Button btnN;
    TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk);


        btnY = findViewById(R.id.buttonYes);
        btnN = findViewById(R.id.buttonNo);
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

/// door op de tekst van de vraag te klikken zal de stem van James worden ingeladen
        tv.setOnClickListener ( new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                speak();
            }
        });


        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(talkActivity.this, questionActivity.class));
            }
        });



        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(talkActivity.this, answerNoActivity.class));
            }
        });
    }


    private void speak(){


        String text = ("Hoi ik ben James. Leuk je te ontmoeten! Ik ben erg nieuwsgierig naar hoe het met jouw studie gaat en of je al weet welke richting je op zou willen. Er zijn namelijk verschillende opties! Heb jij toevallig al stagegelopen? Dat kan soms helpen om erachter te komen wat bij jou past. ");

        /// pitch 1 = mannen stem, vanaf 1.6 lijkt het redelijk op een vrouwen stem
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