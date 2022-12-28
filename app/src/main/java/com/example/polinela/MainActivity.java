package com.example.polinela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageview1, imageview2, imageview3, imageview4, imageview5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview1 = (ImageView) findViewById(R.id.imageView1);
        imageview2 = (ImageView) findViewById(R.id.imageView2);
        imageview3 = (ImageView) findViewById(R.id.imageView3);
        imageview4 = (ImageView) findViewById(R.id.imageView4);
        imageview5 = (ImageView) findViewById(R.id.imageView5);


        imageview1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EkonomiBisnis.class);
                startActivity(intent);
            }
        });

        imageview2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BudidayaTanaman.class);
                startActivity(intent);
            }
        });
        imageview3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Peternakan.class);
                startActivity(intent);
            }
        });
        imageview4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pertanian.class);
                startActivity(intent);
            }
        });
        imageview5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Perkebunan.class);
                startActivity(intent);
            }


        });
    }
}