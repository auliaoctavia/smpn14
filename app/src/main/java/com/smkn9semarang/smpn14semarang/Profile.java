package com.smkn9semarang.smpn14semarang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("profilsekolah.pdf")
                .enableSwipe(true)
                .enableDoubletap(true)
                .load();
    }
}