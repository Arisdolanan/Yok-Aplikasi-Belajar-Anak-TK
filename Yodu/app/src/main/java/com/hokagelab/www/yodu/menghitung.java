package com.hokagelab.www.yodu;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class menghitung extends AppCompatActivity {

    int total = 1;
    int hasil;

    TextView txthasil;

    String angkad1, angkad2;

    EditText angka1, angka2;
    Button submit2;

    Double hasil2=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung);

        angka1 = (EditText) findViewById(R.id.masuk1);
        angka2 = (EditText) findViewById(R.id.masuk2);
        txthasil = (TextView) findViewById(R.id.txthasil2);

        submit2 = (Button) findViewById(R.id.submit22);

        angkad1 = angka1.getText().toString();
        angkad2 = angka2.getText().toString();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Menghitung");


        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angkad1 = angka1.getText().toString();
                angkad2 = angka2.getText().toString();
                if(angkad1.equalsIgnoreCase("") || angkad2.equalsIgnoreCase("")){
                    Snackbar.make(view, "Belum di isi", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }else{
                    angkad1 = angka1.getText().toString();
                    angkad2 = angka2.getText().toString();
                    hasil2 = Double.valueOf(angkad1) + Double.valueOf(angkad2);
                    if (hasil2 == 2){
                        Snackbar.make(view, "Jawaban anda benar, jumlah buah Apel 2 buah", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                        txthasil.setText(String.valueOf(hasil2));

                    }else{
                        Snackbar.make(view, "Jawaban Salah", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();

                    }
                }
            }
        });
    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return  true;
    }

    public void increment (View view){
        if (total == 10) {
            return;
        }
        total = total + 1;
        tampil(total);
    }

    public void decrement (View view){
        if (total == 0) {
            return;
        }
        total = total - 1;
        tampil(total);

    }

    public int tampil(int hasilTotal){
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity);
        quantityTextView.setText("" + hasilTotal);
        return hasilTotal;
    }

    public void submit(View view){
         hasil = tampil(total);

        if (hasil == 1){
            Snackbar.make(view, "Jawaban anda benar, jumlah buah Apel 1 buah", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            Snackbar.make(view, "Jawaban Anda Salah", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
    }


}
