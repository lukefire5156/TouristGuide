package com.lukefire.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hotel extends AppCompatActivity {

    private ImageView vellore;
    private ImageView chennai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        vellore=(ImageView)findViewById(R.id.vellore);
        //vellore.bringToFront();
        vellore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hotel.this, login.class));
            }
        });
        chennai=(ImageView)findViewById(R.id.chennai);
        //chennai.bringToFront();
        chennai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hotel.this, chennai.class));
            }
        });

    }
}
