package com.smkn9semarang.smpn14semarang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.hardware.lights.LightState;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class Ekstrakulikuler extends AppCompatActivity {

    CardView cvPaskibra;
    CardView cvRebana;
    CardView cvSepakbola;
    CardView cvBasket;
    CardView cvPramuka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekstrakulikuler);
        cvPaskibra = findViewById(R.id.Paskibra);
        cvRebana = findViewById(R.id.Rebana);
        cvSepakbola = findViewById(R.id.Sepakbola);
        cvBasket = findViewById(R.id.Basket);
        cvPramuka = findViewById(R.id.Pramuka);

        SliderView sliderView=findViewById(R.id.imageSlider);

        List<Integer> images=new ArrayList<>();
        images.add(R.drawable.paskibb);
        images.add(R.drawable.basketb);
        images.add(R.drawable.pramukad);
        images.add(R.drawable.rebanab);

        MyAdapter myAdapter=new MyAdapter(images);

        sliderView.setSliderAdapter(myAdapter);
        sliderView.setAutoCycle(true);

        cvPaskibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ekstrakulikuler.this,Paskibra.class);
                startActivity(intent);
            }
        });

        cvRebana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ekstrakulikuler.this,Rebana.class);
                startActivity(intent);
            }
        });

        cvSepakbola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ekstrakulikuler.this,Sepakbola.class);
                startActivity(intent);
            }
        });

        cvBasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ekstrakulikuler.this,Basket.class);
                startActivity(intent);
            }
        });

        cvPramuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ekstrakulikuler.this,Pramuka.class);
                startActivity(intent);
            }
        });


    }
}