//NIM       : 10118409
//Nama      : Anzala Filaili Fadlianto
//tanggal pengerjaan : 7 April 2021

package com.example.tugas1_akb_10118409;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamanlogin);

        Button button = findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, login2.class);
                startActivity(intent);
            }
        });
        Button register;
        register = findViewById(R.id.btnDaftar);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, daftar.class);
                startActivity(intent);
            }
        });
    }
}