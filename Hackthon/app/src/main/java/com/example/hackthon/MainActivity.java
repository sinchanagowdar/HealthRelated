package com.example.hackthon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttton =(Button) findViewById(R.id.btn);
        ImageView image1 =(ImageView) findViewById(R.id.img1);


        }

        public void onButtonClick(View view)
        {
            Intent intent = new Intent(this, SecondActivity1.class);
            startActivity(intent);
        }

    public void onCardClick(View view)
    {
        Intent intent = new Intent(this, DiabitesActivity.class);
        startActivity(intent);
    }
    }