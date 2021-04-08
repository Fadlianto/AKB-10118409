//NIM       : 10118409
//Nama      : Anzala Filaili Fadlianto
//tanggal pengerjaan : 7 April 2021
package com.example.tugas1_akb_10118409;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login2);

        Button profil = findViewById(R.id.btnProfil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login2.this, halaman_profile.class);
                startActivity(intent);
            }
        });
        Button logout = findViewById(R.id.btnLogout);
        logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(login2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}