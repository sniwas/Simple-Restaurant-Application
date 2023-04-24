package com.example.restaurantapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class finalpage extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalpage);
        textView=findViewById(R.id.textView4);
        String clr=" ";
        textView.setText(clr);
        Intent intent=getIntent();
        String veg=intent.getStringExtra(vegmenu.EXTRA_FINAL_VEG);
        textView.setText(veg);

    }
}