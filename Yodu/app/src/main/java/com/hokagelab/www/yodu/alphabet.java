package com.hokagelab.www.yodu;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alphabet extends AppCompatActivity {
    Button play, play1, play2, play3, play4, play5, play6, play7, play8, play9, play10, play11, play12, play13, play14, play15, play16, play17, play18, play19, play20, play21, play22, play23, play24, play25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Alphabet");

        play = (Button) findViewById(R.id.play);

        final MediaPlayer mp = MediaPlayer.create(alphabet.this, R.raw.a);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()){
                    mp.pause();
                    play.setBackgroundResource(R.drawable.play);
                }else{
                    mp.start();
                    play.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play1 = (Button) findViewById(R.id.play1);

        final MediaPlayer mp1 = MediaPlayer.create(alphabet.this, R.raw.b);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp1.isPlaying()){
                    mp1.pause();
                    play1.setBackgroundResource(R.drawable.play);
                }else{
                    mp1.start();
                    play1.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play2 = (Button) findViewById(R.id.play2);

        final MediaPlayer mp2 = MediaPlayer.create(alphabet.this, R.raw.c);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp2.isPlaying()){
                    mp2.pause();
                    play2.setBackgroundResource(R.drawable.play);
                }else{
                    mp2.start();
                    play2.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play3 = (Button) findViewById(R.id.play3);

        final MediaPlayer mp3 = MediaPlayer.create(alphabet.this, R.raw.d);
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp3.isPlaying()){
                    mp3.pause();
                    play3.setBackgroundResource(R.drawable.play);
                }else{
                    mp3.start();
                    play3.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play4 = (Button) findViewById(R.id.play4);

        final MediaPlayer mp4 = MediaPlayer.create(alphabet.this, R.raw.e);
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp4.isPlaying()){
                    mp4.pause();
                    play4.setBackgroundResource(R.drawable.play);
                }else{
                    mp4.start();
                    play4.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play5 = (Button) findViewById(R.id.play5);

        final MediaPlayer mp5 = MediaPlayer.create(alphabet.this, R.raw.f);
        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp5.isPlaying()){
                    mp5.pause();
                    play5.setBackgroundResource(R.drawable.play);
                }else{
                    mp5.start();
                    play5.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play6 = (Button) findViewById(R.id.play6);

        final MediaPlayer mp6 = MediaPlayer.create(alphabet.this, R.raw.g);
        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp6.isPlaying()){
                    mp6.pause();
                    play6.setBackgroundResource(R.drawable.play);
                }else{
                    mp6.start();
                    play6.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play7 = (Button) findViewById(R.id.play7);

        final MediaPlayer mp7 = MediaPlayer.create(alphabet.this, R.raw.h);
        play7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp7.isPlaying()){
                    mp7.pause();
                    play7.setBackgroundResource(R.drawable.play);
                }else{
                    mp7.start();
                    play7.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play8 = (Button) findViewById(R.id.play8);

        final MediaPlayer mp8 = MediaPlayer.create(alphabet.this, R.raw.i);
        play8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp8.isPlaying()){
                    mp8.pause();
                    play8.setBackgroundResource(R.drawable.play);
                }else{
                    mp8.start();
                    play8.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play9 = (Button) findViewById(R.id.play9);

        final MediaPlayer mp9 = MediaPlayer.create(alphabet.this, R.raw.j);
        play9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp9.isPlaying()){
                    mp9.pause();
                    play9.setBackgroundResource(R.drawable.play);
                }else{
                    mp9.start();
                    play9.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play10 = (Button) findViewById(R.id.play10);

        final MediaPlayer mp10 = MediaPlayer.create(alphabet.this, R.raw.k);
        play10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp10.isPlaying()){
                    mp10.pause();
                    play10.setBackgroundResource(R.drawable.play);
                }else{
                    mp10.start();
                    play10.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play11 = (Button) findViewById(R.id.play11);

        final MediaPlayer mp11 = MediaPlayer.create(alphabet.this, R.raw.l);
        play11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp11.isPlaying()){
                    mp11.pause();
                    play11.setBackgroundResource(R.drawable.play);
                }else{
                    mp11.start();
                    play11.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play12 = (Button) findViewById(R.id.play12);

        final MediaPlayer mp12 = MediaPlayer.create(alphabet.this, R.raw.m);
        play12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp12.isPlaying()){
                    mp12.pause();
                    play12.setBackgroundResource(R.drawable.play);
                }else{
                    mp12.start();
                    play12.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play13 = (Button) findViewById(R.id.play13);

        final MediaPlayer mp13 = MediaPlayer.create(alphabet.this, R.raw.n);
        play13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp13.isPlaying()){
                    mp13.pause();
                    play13.setBackgroundResource(R.drawable.play);
                }else{
                    mp13.start();
                    play13.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play14 = (Button) findViewById(R.id.play14);

        final MediaPlayer mp14 = MediaPlayer.create(alphabet.this, R.raw.o);
        play14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp14.isPlaying()){
                    mp14.pause();
                    play14.setBackgroundResource(R.drawable.play);
                }else{
                    mp14.start();
                    play14.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play15 = (Button) findViewById(R.id.play15);

        final MediaPlayer mp15 = MediaPlayer.create(alphabet.this, R.raw.p);
        play15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp15.isPlaying()){
                    mp15.pause();
                    play15.setBackgroundResource(R.drawable.play);
                }else{
                    mp15.start();
                    play15.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play16 = (Button) findViewById(R.id.play16);

        final MediaPlayer mp16 = MediaPlayer.create(alphabet.this, R.raw.q);
        play16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp16.isPlaying()){
                    mp16.pause();
                    play16.setBackgroundResource(R.drawable.play);

                }else{
                    mp16.start();
                    play16.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play17 = (Button) findViewById(R.id.play17);

        final MediaPlayer mp17 = MediaPlayer.create(alphabet.this, R.raw.r);
        play17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp17.isPlaying()){
                    mp17.pause();
                    play17.setBackgroundResource(R.drawable.play);
                }else{
                    mp17.start();
                    play17.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play18 = (Button) findViewById(R.id.play18);

        final MediaPlayer mp18 = MediaPlayer.create(alphabet.this, R.raw.s);
        play18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp18.isPlaying()){
                    mp18.pause();
                    play18.setBackgroundResource(R.drawable.play);
                }else{
                    mp18.start();
                    play18.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play19 = (Button) findViewById(R.id.play19);

        final MediaPlayer mp19 = MediaPlayer.create(alphabet.this, R.raw.t);
        play19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp19.isPlaying()){
                    mp19.pause();
                    play19.setBackgroundResource(R.drawable.play);
                }else{
                    mp19.start();
                    play19.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play20 = (Button) findViewById(R.id.play20);

        final MediaPlayer mp20 = MediaPlayer.create(alphabet.this, R.raw.u);
        play20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp20.isPlaying()){
                    mp20.pause();
                    play20.setBackgroundResource(R.drawable.play);
                }else{
                    mp20.start();
                    play20.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play21 = (Button) findViewById(R.id.play21);

        final MediaPlayer mp21 = MediaPlayer.create(alphabet.this, R.raw.v);
        play21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp21.isPlaying()){
                    mp21.pause();
                    play21.setBackgroundResource(R.drawable.play);
                }else{
                    mp21.start();
                    play21.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play22 = (Button) findViewById(R.id.play22);

        final MediaPlayer mp22 = MediaPlayer.create(alphabet.this, R.raw.w);
        play22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp22.isPlaying()){
                    mp22.pause();
                    play22.setBackgroundResource(R.drawable.play);
                }else{
                    mp22.start();
                    play22.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play23 = (Button) findViewById(R.id.play23);

        final MediaPlayer mp23 = MediaPlayer.create(alphabet.this, R.raw.x);
        play23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp23.isPlaying()){
                    mp23.pause();
                    play23.setBackgroundResource(R.drawable.play);
                }else{
                    mp23.start();
                    play23.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        play24 = (Button) findViewById(R.id.play24);

        final MediaPlayer mp24 = MediaPlayer.create(alphabet.this, R.raw.y);
        play24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp24.isPlaying()){
                    mp24.pause();
                    play24.setBackgroundResource(R.drawable.play);
                }else{
                    mp24.start();
                    play24.setBackgroundResource(R.drawable.pause);
                }
            }
        });


        play25 = (Button) findViewById(R.id.play25);

        final MediaPlayer mp25 = MediaPlayer.create(alphabet.this, R.raw.z);
        play25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp25.isPlaying()){
                    mp25.pause();
                    play25.setBackgroundResource(R.drawable.play);
                }else{
                    mp25.start();
                    play25.setBackgroundResource(R.drawable.pause);
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
