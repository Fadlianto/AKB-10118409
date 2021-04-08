//NIM       : 10118409
//Nama      : Anzala Filaili Fadlianto
//tanggal pengerjaan : 8 April 2021

package com.example.tugas1_akb_10118409;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class halaman_profile extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_profile);

        Button button = findViewById(R.id.btnKembali);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(halaman_profile.this, login2.class);
                startActivity(intent);
            }
        });
    }
}