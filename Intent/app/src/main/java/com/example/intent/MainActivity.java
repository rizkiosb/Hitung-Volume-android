package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnPindahActivity;
    Button getBtnPindahActivityWithData;
    Button getGetBtnPindahActivityWithObject;
    Button btnDialPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindahActivity = findViewById(R.id.pindah_activity);
        btnPindahActivity.setOnClickListener(this);
        getBtnPindahActivityWithData = findViewById(R.id.pindah_activity_dengan_data);
        getBtnPindahActivityWithData.setOnClickListener(this);
        getGetBtnPindahActivityWithObject = findViewById(R.id.pindah_activity__dengan_object);
        getGetBtnPindahActivityWithObject.setOnClickListener(this);
        btnDialPhone = findViewById(R.id.dial);
        btnDialPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.pindah_activity:
                Intent PindahIntent = new Intent(MainActivity.this,Tampilan_pindah_activity.class);
                startActivity(PindahIntent);
            break;
            case R.id.pindah_activity_dengan_data:
                Intent pindah_dengan_data = new Intent(MainActivity.this, Tampilan_pindah_activity_dengan_data.class);

                pindah_dengan_data.putExtra(Tampilan_pindah_activity_dengan_data.Extra_nama,"Muhammad Rizki OSB");
                pindah_dengan_data.putExtra(Tampilan_pindah_activity_dengan_data.Extra_umur,22);
                startActivity(pindah_dengan_data);
                break;
            case R.id.pindah_activity__dengan_object:
                Intent pindah_dengan_object = new Intent(MainActivity.this,Pindah_activity_dengan_object.class);
                //belum di buat
                startActivity(pindah_dengan_object);
                break;
            case R.id.dial:
                String Nomor = "085608115353";
                Intent DialNumber = new Intent(Intent.ACTION_DIAL, Uri.parse(("tel:"+Nomor)));
                startActivity(DialNumber);
                break;
            case R.id.pindah_activity_untuk_result:
                //belum dibuat
                break;
        }
    }
}
