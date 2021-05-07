package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//Nama  : Agus Awaludin
//Kelas : IF-2
//Nim   : 10118067
//Tanggal pengerjaan    : 7 Mei 2021
//Deskripsi pekerjaan   : Membuat tampilan halaman awal dan membuat intent untuk pindah ke halaman kk

public class halaman_awal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_awal);
    }
    public void pindah1(View view) {
        Intent intent = new Intent(this, halaman_kk.class);
        startActivity(intent);
    }
}