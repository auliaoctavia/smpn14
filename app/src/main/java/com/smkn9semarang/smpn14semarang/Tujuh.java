package com.smkn9semarang.smpn14semarang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Tujuh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuh);

        TextView textView = findViewById(R.id.paivii);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView1 = findViewById(R.id.bindovii);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView2 = findViewById(R.id.ipasatuvii);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView3 = findViewById(R.id.ipaduavii);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView4 = findViewById(R.id.prakaryavii);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView5 = findViewById(R.id.senbudvii);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView6 = findViewById(R.id.penjasvii);
        textView6.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView7 = findViewById(R.id.pknvii);
        textView7.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView8 = findViewById(R.id.binggrisvii);
        textView8.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView9 = findViewById(R.id.mtkvii);
        textView9.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView10 = findViewById(R.id.ipsvii);
        textView10.setMovementMethod(LinkMovementMethod.getInstance());

    }
}