package com.lukefire.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class login extends AppCompatActivity {

    private ImageView hotel;
    private ImageView rest;
    private ImageView travel;
    private ImageView shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        hotel=(ImageView) findViewById(R.id.hotel);
        hotel.bringToFront();
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this, hotel.class));
            }
        });
        rest=(ImageView) findViewById(R.id.rest);
        rest.bringToFront();
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this, rest.class));
            }
        });
        travel=(ImageView) findViewById(R.id.travel);
        travel.bringToFront();
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this, travel.class));
            }
        });
        shop=(ImageView) findViewById(R.id.shop);
        shop.bringToFront();
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this, shop.class));
            }
        });

    }
}
