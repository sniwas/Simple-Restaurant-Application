package com.example.restaurantapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Veg_Nonveg extends AppCompatActivity {
    ImageButton veg,nonveg;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_nonveg);
        veg=findViewById(R.id.imageButton4);
        nonveg=findViewById(R.id.imageButton5);
        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),vegmenu.class);
                startActivity(intent);
            }
        });
        nonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),nonvegmenu.class);
                startActivity(intent);
            }
        });
    }
}