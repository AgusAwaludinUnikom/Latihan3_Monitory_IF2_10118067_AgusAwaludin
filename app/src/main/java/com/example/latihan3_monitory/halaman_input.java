package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

//Nama  : Agus Awaludin
//Kelas : IF-2
//Nim   : 10118067
//Tanggal pengerjaan    : 7 Mei 2021
//Deskripsi pekerjaan   : Membuat tampilan halaman input dan membuat intent untuk pindah ke halaman akhir

public class halaman_input extends AppCompatActivity {

    public static final String INPUT_NICK = "com.example.latihan3_monitory.INPUT_NICK";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_input);
    }

    public void pindah3(View view) {
        EditText nickName = (EditText) findViewById(R.id.isinama);

        if (nickName.length() < 3) {
            Toast.makeText(this, "Nama panggilan harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, halaman_akhir.class);
        intent.putExtra(INPUT_NICK, nickName.getText().toString());
        startActivity(intent);

    }
}