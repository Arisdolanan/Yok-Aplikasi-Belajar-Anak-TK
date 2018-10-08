package com.hokagelab.www.yodu;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class angka extends AppCompatActivity {
    Button play31, play32, play33, play34, play35, play36, play37, play38, play39, play40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Angka");


        play31 = (Button) findViewById(R.id.play31);

        final MediaPlayer mp31 = MediaPlayer.create(angka.this,R.raw.satu);

        play31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp31.isPlaying()){
                    mp31.pause();
                    play31.setBackgroundResource(R.drawable.play);
                }else{
                    mp31.start();
                    play31.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play32 = (Button) findViewById(R.id.play32);

        final MediaPlayer mp32 = MediaPlayer.create(angka.this,R.raw.dua);

        play32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp32.isPlaying()){
                    mp32.pause();
                    play32.setBackgroundResource(R.drawable.play);
                }else{
                    mp32.start();
                    play32.setBackgroundResource(R.drawable.pause);
                }
            }
        });


        play33 = (Button) findViewById(R.id.play33);

        final MediaPlayer mp33 = MediaPlayer.create(angka.this,R.raw.tiga);

        play33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp33.isPlaying()){
                    mp33.pause();
                    play33.setBackgroundResource(R.drawable.play);
                }else{
                    mp33.start();
                    play33.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play34 = (Button) findViewById(R.id.play34);

        final MediaPlayer mp34 = MediaPlayer.create(angka.this,R.raw.empat);

        play34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp34.isPlaying()){
                    mp34.pause();
                    play34.setBackgroundResource(R.drawable.play);
                }else{
                    mp34.start();
                    play34.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play35 = (Button) findViewById(R.id.play35);

        final MediaPlayer mp35 = MediaPlayer.create(angka.this,R.raw.lima);

        play35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp35.isPlaying()){
                    mp35.pause();
                    play35.setBackgroundResource(R.drawable.play);
                }else{
                    mp35.start();
                    play35.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play36 = (Button) findViewById(R.id.play36);

        final MediaPlayer mp36 = MediaPlayer.create(angka.this,R.raw.enam);

        play36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp36.isPlaying()){
                    mp36.pause();
                    play36.setBackgroundResource(R.drawable.play);
                }else{
                    mp36.start();
                    play36.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play37 = (Button) findViewById(R.id.play37);

        final MediaPlayer mp37 = MediaPlayer.create(angka.this,R.raw.tujuh);

        play37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp37.isPlaying()){
                    mp37.pause();
                    play37.setBackgroundResource(R.drawable.play);
                }else{
                    mp37.start();
                    play37.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play38 = (Button) findViewById(R.id.play38);

        final MediaPlayer mp38 = MediaPlayer.create(angka.this,R.raw.delapan);

        play38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp38.isPlaying()){
                    mp38.pause();
                    play38.setBackgroundResource(R.drawable.play);
                }else{
                    mp38.start();
                    play38.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play39 = (Button) findViewById(R.id.play39);

        final MediaPlayer mp39 = MediaPlayer.create(angka.this,R.raw.sembilan);

        play39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp39.isPlaying()){
                    mp39.pause();
                    play39.setBackgroundResource(R.drawable.play);
                }else{
                    mp39.start();
                    play39.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play40 = (Button) findViewById(R.id.play40);

        final MediaPlayer mp40 = MediaPlayer.create(angka.this,R.raw.sepuluh);

        play40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp40.isPlaying()){
                    mp40.pause();
                    play40.setBackgroundResource(R.drawable.play);
                }else{
                    mp40.start();
                    play40.setBackgroundResource(R.drawable.pause);
                }
            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
