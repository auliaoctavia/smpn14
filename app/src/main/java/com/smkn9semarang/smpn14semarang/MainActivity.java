package com.smkn9semarang.smpn14semarang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cvGurudanstaff;
    CardView cvProfile;
    CardView cvEkstrakulikuler;
    CardView cvFasilitas;
    CardView cvPerpus;
    CardView cvGalery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cvGurudanstaff = findViewById(R.id.Gurudanstaff);
        cvProfile = findViewById(R.id.Profile);
        cvEkstrakulikuler = findViewById(R.id.Ekstrakulikuler);
        cvFasilitas = findViewById(R.id.Fasilitas);
        cvPerpus = findViewById(R.id.Perpus);
        cvGalery = findViewById(R.id.Galery);

        cvGurudanstaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Gurudanstaff.class);
                startActivity(intent);
            }
        });

        cvProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Profile.class);
                startActivity(intent);
            }
        });

        cvEkstrakulikuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Ekstrakulikuler.class);
                startActivity(intent);
            }
        });

        cvFasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Fasilitas.class);
                startActivity(intent);
            }
        });

        cvPerpus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Perpus.class);
                startActivity(intent);
            }
        });

        cvGalery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Galery.class);
                startActivity(intent);
            }
        });

    }
}