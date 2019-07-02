package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Tampilan_pindah_activity_dengan_data extends AppCompatActivity {
    public static final String Extra_umur = "extra_umur";
    public static final String Extra_nama = "extra_nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_dengan_data);

        TextView Data_Diterima = findViewById(R.id.Data_diterima);
        String nama = getIntent().getStringExtra(Extra_nama);
        int umur = getIntent().getIntExtra(Extra_umur,0);

        String Text = "Nama saya : " +nama+" \nUmur saya : "+umur;
        Data_Diterima.setText(Text);
    }
}
