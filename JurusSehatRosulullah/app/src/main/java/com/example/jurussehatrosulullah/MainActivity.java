package com.example.jurussehatrosulullah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView Jrs;
    private ArrayList<Obat>list= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Jrs = findViewById(R.id.obat);
        Jrs.setHasFixedSize(true);
        list.addAll(Desc_obat.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        Jrs.setLayoutManager(new LinearLayoutManager(this));
        ListObat listObatAdapter = new ListObat(list);
        Jrs.setAdapter(listObatAdapter);
        listObatAdapter.setOnItemClickCallback(new ListObat.OnItemClickCallback(){
            @Override
            public void onItemClicked(Obat data) {
                if (data.getNama().equals("Autoimun")){
                    Intent PindahIntent = new Intent(MainActivity.this,Autoimun.class);
                    PindahIntent.putExtra(Autoimun.Extra_nama,data.getNama());
                    PindahIntent.putExtra(Autoimun.Extra_desc,data.getDescripsi());
                    startActivity(PindahIntent);
                }else if (data.getNama().equals("Anti Biotik")){
                    Intent PindahIntent = new Intent(MainActivity.this,Anti_biotik.class);
                    PindahIntent.putExtra(Autoimun.Extra_nama,data.getNama());
                    PindahIntent.putExtra(Autoimun.Extra_desc,data.getDescripsi());
                    startActivity(PindahIntent);
                }else if (data.getNama().equals("Anti Pilek")){
                    Intent PindahIntent = new Intent(MainActivity.this,Anti_pilek.class);
                    PindahIntent.putExtra(Autoimun.Extra_nama,data.getNama());
                    PindahIntent.putExtra(Autoimun.Extra_desc,data.getDescripsi());
                    startActivity(PindahIntent);
                }else if (data.getNama().equals("Antioksidan")){
                    Intent PindahIntent = new Intent(MainActivity.this,Antioksidan.class);
                    PindahIntent.putExtra(Autoimun.Extra_nama,data.getNama());
                    PindahIntent.putExtra(Autoimun.Extra_desc,data.getDescripsi());
                    startActivity(PindahIntent);
                }else if (data.getNama().equals("Asam Urat")){
                    Intent PindahIntent = new Intent(MainActivity.this,Asamurat.class);
                    PindahIntent.putExtra(Autoimun.Extra_nama,data.getNama());
                    PindahIntent.putExtra(Autoimun.Extra_desc,data.getDescripsi());
                    startActivity(PindahIntent);
                }else if (data.getNama().equals("Golden Latte")){
                    Intent PindahIntent = new Intent(MainActivity.this,Golden_latte.class);
                    PindahIntent.putExtra(Autoimun.Extra_nama,data.getNama());
                    PindahIntent.putExtra(Autoimun.Extra_desc,data.getDescripsi());
                    startActivity(PindahIntent);
                }else if (data.getNama().equals("Jantung Sehat")){
                    Intent PindahIntent = new Intent(MainActivity.this,Jantung_sehat.class);
                    PindahIntent.putExtra(Autoimun.Extra_nama,data.getNama());
                    PindahIntent.putExtra(Autoimun.Extra_desc,data.getDescripsi());
                    startActivity(PindahIntent);
                }else if (data.getNama().equals("Anti Batuk Berdahak")){
                    Intent PindahIntent = new Intent(MainActivity.this,Anti_batuk.class);
                    PindahIntent.putExtra(Autoimun.Extra_nama,data.getNama());
                    PindahIntent.putExtra(Autoimun.Extra_desc,data.getDescripsi());
                    startActivity(PindahIntent);
                }else if (data.getNama().equals("Infused water apple + Kayu manis")){
                    Intent PindahIntent = new Intent(MainActivity.this,Infus_apel.class);
                    PindahIntent.putExtra(Autoimun.Extra_nama,data.getNama());
                    PindahIntent.putExtra(Autoimun.Extra_desc,data.getDescripsi());
                    startActivity(PindahIntent);
                }else if (data.getNama().equals("Ultimate")){
                    Intent PindahIntent = new Intent(MainActivity.this,Ultimate.class);
                    PindahIntent.putExtra(Autoimun.Extra_nama,data.getNama());
                    PindahIntent.putExtra(Autoimun.Extra_desc,data.getDescripsi());
                    startActivity(PindahIntent);
                }
            }
        });
    }
}
