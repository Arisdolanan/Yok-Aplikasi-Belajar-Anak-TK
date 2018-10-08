package com.hokagelab.www.yodu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class hewan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Hewan");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
