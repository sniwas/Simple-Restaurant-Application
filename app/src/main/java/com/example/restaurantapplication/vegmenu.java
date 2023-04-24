package com.example.restaurantapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class vegmenu extends AppCompatActivity {
    int vegtotal = 0;
    CheckBox c1,c2,c3,c4,c5,c6,c7;
    Button vegsubmit;
    public static final String EXTRA_FINAL_VEG="Nothing";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegmenu);
        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);
        c5=findViewById(R.id.checkBox5);
        c6=findViewById(R.id.checkBox6);
        c7=findViewById(R.id.checkBox7);
        //finalpg=findViewById(R.id.textView4);
        vegsubmit=findViewById(R.id.button);
        vegsubmit.setOnClickListener(new View.OnClickListener() {
            String finalpg ;
            @Override
            public void onClick(View v) {
                finalpg = " ";
                finalpg+="\n     Veg Meals\n\n";
                if(c1.isChecked()){
                    vegtotal+=56;
                    finalpg+="Chapati[2] Rs.56\n";
                }
                if(c2.isChecked()){
                    vegtotal+=60;
                    finalpg+="Porata[2] Rs.60\n";
                }
                if(c3.isChecked()){
                    vegtotal+=80;
                    finalpg+="Gobi manchurian Rs.80\n";
                }
                if(c4.isChecked()){
                    vegtotal+=90;
                    finalpg+="Veg Rice Rs.90\n";
                }
                if(c5.isChecked()){
                    vegtotal+=110;
                    finalpg+="South Indian Meals Rs.110\n";
                }
                if(c6.isChecked()){
                    vegtotal+=125;
                    finalpg+="Mushroom Biryani Rs.125\n";
                }
                if(c7.isChecked()){
                    vegtotal+=21;
                    finalpg+="Sweet of the day Rs.21\n";
                }
                finalpg+="\nTotal Amount : Rs."+vegtotal;
                vegtotal=0;
                Intent intent=new Intent(vegmenu.this,finalpage.class);
                intent.putExtra(EXTRA_FINAL_VEG,finalpg);
                startActivity(intent);
            }
        });
    }
}