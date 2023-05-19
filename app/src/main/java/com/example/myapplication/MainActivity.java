package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btngen;
        TextView tvresult,tvresult2,tvresult3,tvresult8;



        btngen = (Button) findViewById(R.id.btngen);
        tvresult = (TextView) findViewById(R.id.tvresult);
        tvresult2 = (TextView) findViewById(R.id.tvresult2);
        tvresult3 = (TextView) findViewById(R.id.tvresult3);
        tvresult8 = (TextView) findViewById(R.id.tvresult8);
        btngen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(generateString(6));
                tvresult2.setText(generateString(3));
                tvresult3.setText(generateString(1));
                tvresult8.setText(generateString(7));

            }
        });
     }
     private String generateString(int lenght){
        char [] chars ="1234567".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
         Random random = new Random();
         for(int i=0;i<lenght;i++){
             char c =chars[random.nextInt(chars.length)];
             stringBuilder.append(c);
         }
         return stringBuilder.toString();
     }
}