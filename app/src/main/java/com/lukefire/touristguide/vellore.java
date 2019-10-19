package com.lukefire.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class vellore extends AppCompatActivity {

    private ImageView fortune;
    private ImageView ranga;
    private ImageView sgrt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vellore);

        sgrt=(ImageView) findViewById(R.id.sgrt);
        sgrt.bringToFront();
        sgrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vellore.this, hotelmap.class));
            }
        });
        fortune=(ImageView) findViewById(R.id.fortunepark);
        fortune.bringToFront();
        fortune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vellore.this, hotelmap.class));
            }
        });
        ranga=(ImageView) findViewById(R.id.ranga);
        ranga.bringToFront();
        ranga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vellore.this, hotelmap.class));
            }
        });

    }
}
