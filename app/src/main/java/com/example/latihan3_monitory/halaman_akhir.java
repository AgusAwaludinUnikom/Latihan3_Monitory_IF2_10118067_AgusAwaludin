package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Nama  : Agus Awaludin
//Kelas : IF-2
//Nim   : 10118067
//Tanggal pengerjaan    : 7 Mei 2021
//Deskripsi pekerjaan   : Membuat tampilan halaman akhir dan membuat method keluar untuk keluar dari aplikasi

public class halaman_akhir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_akhir);

        String nickName = getIntent().getStringExtra(halaman_input.INPUT_NICK);

        String text = getString(R.string.pesan_beres).toString();
        TextView textberes = (TextView)findViewById(R.id.textberes);

        textberes.setText(String.format(text, nickName).toString());

    }

    public void keluar(View view) {
        finishAffinity();
        finishAndRemoveTask();
    }
}