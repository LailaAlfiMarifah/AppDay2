package com.example.appday2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvHasil;
    private EditText etPanjang, etLebar, etTinggi;
    private Button btnKalkulasi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // deklarasi => memasukkan nilai yang nanti nya di inputkan , kedalam masing masing variabel
        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        btnKalkulasi = findViewById(R.id.btnKalkulasi);
        tvHasil = findViewById(R.id.tvHasil);
        btnKalkulasi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnKalkulasi){
            String inputPanjang = etPanjang.getText().toString().trim();
            String inputLebar = etLebar.getText().toString().trim();
            String inputTinggi = etTinggi.getText().toString().trim();

            // Memeriksa apakah input kosong atau tidak
            if (!inputPanjang.isEmpty() && !inputLebar.isEmpty() && !inputTinggi.isEmpty()) {
                // Mengonversi input ke tipe double
                double panjang = Double.parseDouble(inputPanjang);
                double lebar = Double.parseDouble(inputLebar);
                double tinggi = Double.parseDouble(inputTinggi);

                // Menghitung volume
                double Hasil = panjang * lebar * tinggi;

                // Menampilkan hasil volume
                tvHasil.setText("Volume: " + Hasil);
            } else {
                // Jika ada input yang kosong, tampilkan pesan kesalahan
                tvHasil.setText("Mohon masukkan panjang, lebar, dan tinggi.");
            }

        }
    }

}