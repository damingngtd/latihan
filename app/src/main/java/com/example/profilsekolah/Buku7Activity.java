package com.example.profilsekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Buku7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku7);
    }

    public void mtk7(View view) {
        goToUrl("https://drive.google.com/file/d/17zaH5O0YRtMNueKxCKeNv2U1_An7QOiK/view?usp=drivesdk");
    }

    public void ipa7(View view) {
        goToUrl("https://drive.google.com/file/d/17zaH5O0YRtMNueKxCKeNv2U1_An7QOiK/view?usp=drivesdk");
    }

    public void bin7(View view) {
        goToUrl("https://drive.google.com/file/d/17zaH5O0YRtMNueKxCKeNv2U1_An7QOiK/view?usp=drivesdk");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent LaunchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(LaunchBrowser);
    }
}