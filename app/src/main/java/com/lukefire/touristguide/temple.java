package com.lukefire.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class temple extends AppCompatActivity {

    private ImageView temple;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple);

        temple=(ImageView) findViewById(R.id.temple);
        temple.bringToFront();
        temple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(temple.this, hotelmap.class));
            }
        });

    }
}
