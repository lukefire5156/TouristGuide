package com.lukefire.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class travel extends AppCompatActivity {

    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        radioGroup = (RadioGroup) findViewById(R.id.RGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.temple) {
                    startActivity(new Intent(travel.this, temple.class));
                } else if(checkedId == R.id.HistoricPlaces) {
                    startActivity(new Intent(travel.this, history.class));
                } else if(checkedId == R.id.children){
                    startActivity(new Intent(travel.this, children.class));
                } else if(checkedId == R.id.beach){
                    startActivity(new Intent(travel.this, beach.class));
                }
            }

        });

    }
}
