package com.example.hitungvolume;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtPanjang;
    private EditText edtLebar;
    private EditText edtTinggi;
    private Button edtHitung;
    private TextView edtHasil;
    private static final String STATE_RESULT = "state_result";

    @Override
    protected  void onSaveInstanceState(Bundle outstate){
        super.onSaveInstanceState(outstate);
        outstate.putString(STATE_RESULT,edtHasil.getText().toString());
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPanjang = findViewById(R.id.edt_panjang);
        edtLebar = findViewById(R.id.edt_lebar);
        edtTinggi= findViewById(R.id.edt_Tinggi);
        edtHitung = findViewById(R.id.hitung);
        edtHasil = findViewById(R.id.TampilHasil);

        edtHitung.setOnClickListener(this);
        if (savedInstanceState != null){
            String result = savedInstanceState.getString(STATE_RESULT);
            edtHasil.setText(result);
        }
    }

    @Override
    public void onClick(View btnHitung) {
        if (btnHitung.getId()== R.id.hitung){
            String inputPanjang = edtPanjang.getText().toString().trim();
            String inputLebar = edtLebar.getText().toString().trim();
            String inputTinggi = edtTinggi.getText().toString().trim();

            boolean isEmptyField = false;
            boolean isInvalidDouble = false;
            if (TextUtils.isEmpty(inputPanjang)){
                isEmptyField=true;
                edtPanjang.setError("Field Harus Diisi!!");
            }
            if (TextUtils.isEmpty(inputLebar)){
                isEmptyField=true;
                edtLebar.setError("Field Harus Diisi!!");

            }
            if (TextUtils.isEmpty(inputTinggi)){
                isEmptyField=true;
                edtTinggi.setError("Field Harus Diisi!!");
            }

            Double Panjang = toDouble(inputPanjang);
            Double Lebar = toDouble(inputLebar);
            Double Tinggi = toDouble(inputTinggi);

            if (Panjang == null){
                isInvalidDouble= true;
                edtPanjang.setError("Field ini harus berupa angka!!");
            }
            if (Lebar==null){
                isInvalidDouble=true;
                edtLebar.setError("Field ini harus berupa angka!!");
            }
            if (Tinggi==null){
                isInvalidDouble=true;
                edtTinggi.setError("Field ini harus berupa angka");
            }
            if (!isEmptyField && !isInvalidDouble) {
                double volume = Panjang * Lebar * Tinggi;
                edtHasil.setText(String.valueOf(volume));
            }
        }
    }
    private Double toDouble(String str){
        try {
            return Double.valueOf(str);
        }catch (NumberFormatException e){
            return null;
        }
    }
}

