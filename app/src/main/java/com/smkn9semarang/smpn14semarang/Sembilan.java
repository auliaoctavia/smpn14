package com.smkn9semarang.smpn14semarang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Sembilan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sembilan);


        TextView textView = findViewById(R.id.paixi);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView1 = findViewById(R.id.bindoxi);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView2 = findViewById(R.id.ipasatuxi);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView3 = findViewById(R.id.prakaryaxi);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView4 = findViewById(R.id.senbudxi);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView5 = findViewById(R.id.penjasxi);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView6 = findViewById(R.id.pknxi);
        textView6.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView7 = findViewById(R.id.binggrisxi);
        textView7.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView8 = findViewById(R.id.mtkxi);
        textView8.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView9 = findViewById(R.id.ipsxi);
        textView9.setMovementMethod(LinkMovementMethod.getInstance());
    }
}