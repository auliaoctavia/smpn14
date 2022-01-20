package com.smkn9semarang.smpn14semarang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class Galery extends AppCompatActivity {

    CardView cvUpacara;
    CardView cvKejuaraan;
    CardView cvVaksinasi;
    CardView cvSenam;
    CardView cvMpls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
        cvUpacara = findViewById(R.id.Upacara);
        cvKejuaraan = findViewById(R.id.Kejuaraan);
        cvVaksinasi = findViewById(R.id.Vaksinasi);
        cvSenam = findViewById(R.id.Senam);
        cvMpls = findViewById(R.id.Mpls);

        SliderView sliderView=findViewById(R.id.imageSlider);

        List<Integer> images=new ArrayList<>();
        images.add(R.drawable.senamac);
        images.add(R.drawable.upacarae);
        images.add(R.drawable.apela);
        images.add(R.drawable.apelb);

        MyAdapter myAdapter=new MyAdapter(images);

        sliderView.setSliderAdapter(myAdapter);
        sliderView.setAutoCycle(true);

        cvUpacara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this,Upacara.class);
                startActivity(intent);
            }
        });

        cvKejuaraan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this,Kejuaraan.class);
                startActivity(intent);
            }
        });

        cvVaksinasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this,Vaksinasi.class);
                startActivity(intent);
            }
        });

        cvSenam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this,Senam.class);
                startActivity(intent);
            }
        });

        cvMpls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galery.this,Mpls.class);
                startActivity(intent);
            }
        });

    }
}