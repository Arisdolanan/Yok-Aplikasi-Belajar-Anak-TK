package com.hokagelab.www.yodu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class buah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Buah");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
