package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewPropertyAnimatorListener;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button play,pause,stop;
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=(Button)findViewById(R.id.play);
        pause=(Button)findViewById(R.id.pause);
        stop=(Button)findViewById(R.id.stop);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.play:
                mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.mymusic);
                mediaPlayer.start();

                break;
            case R.id.pause:
                break;
            case R.id.stop:
                break;
        }
    }
}
