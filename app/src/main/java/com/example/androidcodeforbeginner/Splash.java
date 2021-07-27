package com.example.androidcodeforbeginner;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class Splash extends Activity {
    MediaPlayer ourSong;
    @Override
    protected void onCreate(@Nullable Bundle codeWithAbhinav) {
        super.onCreate(codeWithAbhinav);
        setContentView(R.layout.splash);

        ourSong = MediaPlayer.create(Splash.this, R.raw.mixsound);
        ourSong.start();
        Thread timer = new Thread() {

            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent openStartPoint = new Intent("com.example.androidcodeforbeginner.LISTOFPROGRAM");
                    startActivity(openStartPoint);

                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();
    }
}
