package com.example.sophie.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlayer = MediaPlayer.create(MainActivity.this, R.raw.davina_what_about_us|R.raw.emily_hearn_volcano);
    }



    public void play(View view) {

        if (mPlayer.isPlaying()) {
            mPlayer.pause();
        } else {
            mPlayer.start();

        }
    }

}
