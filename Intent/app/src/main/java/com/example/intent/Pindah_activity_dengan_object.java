package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Pindah_activity_dengan_object extends AppCompatActivity {
    public static final String Extra_Email = "Email";
    public static final String Extra_alamat ="Alamat";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_dengan_object);
        Intent i = new Intent(this,Tampilan_pindah_activity_dengan_data.class);
        TextView Data_object = findViewById(R.id.Data_object);
        String Email = getIntent().getStringExtra(Extra_Email);
        String Alamat = getIntent().getStringExtra(Extra_alamat);
        //untuk object blm di buat
    }
}
