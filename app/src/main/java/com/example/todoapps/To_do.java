package com.example.todoapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class To_do extends AppCompatActivity {
    FloatingActionButton Add;
    TextView xPass;
    EditText eTaks,eJenis,eWaktu;
    String taks,Jenis,Waktu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);
        xPass=findViewById(R.id.tvNama);
        eTaks=findViewById(R.id.eTaks);
        eJenis=findViewById(R.id.eJenis);
        eWaktu=findViewById(R.id.eWaktu);
        Add=findViewById(R.id.AddBut);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               taks = eTaks.getText().toString();

              Jenis =  eJenis.getText().toString();

             Waktu =   eWaktu.getText().toString();

                Intent LA = new Intent(To_do.this,Hasil_todo.class);

                LA.putExtra("tks",taks);
                LA.putExtra("jns",Jenis);
                LA.putExtra("Wkt",Waktu);

                startActivity(LA);
            }
        });



        Bundle btr =getIntent().getExtras();

        String nama =btr.getString("aura");

        xPass.setText(nama);



    }

}