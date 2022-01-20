package com.smkn9semarang.smpn14semarang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Delapan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delapan);

        TextView textView = findViewById(R.id.paiviii);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView1 = findViewById(R.id.bindoviii);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView2 = findViewById(R.id.ipasatuviii);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView3 = findViewById(R.id.prakaryaviii);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView4 = findViewById(R.id.senbudviii);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView5 = findViewById(R.id.penjasviii);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView6 = findViewById(R.id.pknviii);
        textView6.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView7 = findViewById(R.id.binggrisviii);
        textView7.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView8 = findViewById(R.id.mtkviii);
        textView8.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView9 = findViewById(R.id.ipsviii);
        textView9.setMovementMethod(LinkMovementMethod.getInstance());
    }
}