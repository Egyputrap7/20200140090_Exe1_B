package com.example.todoapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Hasil_todo extends AppCompatActivity {
    TextView eTaks,eJenis,eWaktu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_todo);

        eTaks = findViewById(R.id.eTaks);
        eJenis = findViewById(R.id.eJenis);
        eWaktu = findViewById(R.id.eWaktu);

        Bundle ae = getIntent().getExtras();

        String taks = ae.getString("tks");
        String jenis =ae.getString("jns");
        String waktu = ae.getString("Wkt");

        eTaks.setText(taks);
        eJenis.setText(jenis);
        eWaktu.setText(waktu);





    }
}