package com.smkn9semarang.smpn14semarang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Perpus extends AppCompatActivity {

    CardView cvTujuh;
    CardView cvDelapan;
    CardView cvSembilan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpus);
        cvTujuh = findViewById(R.id.Tujuh);
        cvDelapan = findViewById(R.id.Delapan);
        cvSembilan = findViewById(R.id.Sembilan);

        cvTujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perpus.this,Tujuh.class);
                startActivity(intent);
            }
        });

        cvDelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perpus.this,Delapan.class);
                startActivity(intent);
            }
        });

        cvSembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perpus.this,Sembilan.class);
                startActivity(intent);
            }
        });

    }
}