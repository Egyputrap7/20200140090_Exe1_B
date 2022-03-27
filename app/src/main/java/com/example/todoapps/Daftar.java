package com.example.todoapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Daftar extends AppCompatActivity {

    EditText edtNama, edtEmail, edtPasssword, edtrepass;

    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama = findViewById(R.id.edNama);
        edtEmail = findViewById(R.id.edEmail);
        edtPasssword = findViewById(R.id.edPass);
        edtrepass = findViewById(R.id.edrepas);
        fab = findViewById(R.id.fabSimpan);

        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (edtNama.getText().toString().isEmpty()||
                        edtEmail.getText().toString().isEmpty()||
                        edtPasssword.getText().toString().isEmpty()||
                        edtrepass.getText().toString().isEmpty())
                {
                    Snackbar.make(view,"Wajib Di isi seluruh data!!",Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if (edtPasssword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil...!!",
                                Toast.LENGTH_LONG).show();
                        Intent a = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(a);
                    }
                    else
                    {
                        Snackbar.make(view, "Password dan Repassword harus sama!!!",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}