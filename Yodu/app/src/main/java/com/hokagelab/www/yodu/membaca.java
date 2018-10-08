package com.hokagelab.www.yodu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class membaca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membaca);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Membaca");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
