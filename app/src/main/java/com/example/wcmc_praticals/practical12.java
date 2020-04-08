package com.example.wcmc_praticals;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;


public class practical12 extends AppCompatActivity {
    private TextToSpeech t1;
    private final int REQUEST_SPEECH_RECOGNIZER = 3000;
    private TextView question, answer;
    private final String mQuestion = "Who is the owner of this phone?";
    private String mAnswer = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical12);
        question = (TextView) findViewById(R.id.textView);
        answer = (TextView) findViewById(R.id.textView1);
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                }
            }
        });
        startSpeechRecognizer();
    }
    private void startSpeechRecognizer() {
        Intent intent = new Intent
                (RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, mQuestion);
        startActivityForResult(intent, REQUEST_SPEECH_RECOGNIZER);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_SPEECH_RECOGNIZER) {
            if (resultCode == RESULT_OK) {
                List<String> results = data.getStringArrayListExtra
                        (RecognizerIntent.EXTRA_RESULTS);
                mAnswer = results.get(0);
                question.setText(mQuestion);
                answer.setText(mAnswer);
                if (mAnswer.toUpperCase().indexOf("SMIT") > -1) {
                    t1.speak("Great You are correct", TextToSpeech.QUEUE_FLUSH, null, "adfvsfgbrsgh");
                }
                else {
                    t1.speak("Wrong answer submit this phone to my owner Smit", TextToSpeech.QUEUE_FLUSH, null, "adfvsfgbrsgh");
                }
            }
        }
    }
    @Override
    public void onPause(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }
}
