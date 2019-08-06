package com.example.jurussehatrosulullah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Asamurat extends AppCompatActivity {
    public static final String Extra_desc = "extra_desc";
    public static final String Extra_nama = "extra_nama";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asamurat);
        TextView Data_Diterima = findViewById(R.id.nama);
        TextView Desc = findViewById(R.id.desc);
        String nama = getIntent().getStringExtra(Extra_nama);
        String descr = getIntent().getStringExtra(Extra_desc);
        Data_Diterima.setText(nama);
        Desc.setText(descr);
    }
}
