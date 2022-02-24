package com.example.profilsekolah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class perpusActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.membaca1,
            R.drawable.eskul2,
            R.drawable.membaca1,
            R.drawable.eskul2,
            R.drawable.membaca1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }


    public void buku7(View view) {
        Intent intent = new Intent(perpusActivity.this,Buku7Activity.class);
        startActivity(intent);
    }

    public void buku8(View view) {
        Intent intent = new Intent(perpusActivity.this,Buku8Activity.class);
        startActivity(intent);
    }

    public void buku9(View view) {
        Intent intent = new Intent(perpusActivity.this,Buku9Activity.class);
        startActivity(intent);
    }
}
