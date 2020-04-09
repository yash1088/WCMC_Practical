package com.example.wcmc_praticals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Intent intent;
    Button p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 = findViewById(R.id.pratical1);
        p2 = findViewById(R.id.pratical2);
        p3 = findViewById(R.id.pratical3);
        p4 = findViewById(R.id.pratical4);
        p5 = findViewById(R.id.pratical5);
        p6 = findViewById(R.id.pratical6);
        p7 = findViewById(R.id.pratical7);
        p8 = findViewById(R.id.pratical8);
        p9 = findViewById(R.id.pratical9);
        p10 = findViewById(R.id.pratical10);
        p11 = findViewById(R.id.pratical11);
        p12 = findViewById(R.id.pratical12);
        p13 = findViewById(R.id.pratical13);
        p14 = findViewById(R.id.pratical14);


        p1.setOnClickListener(this);
        p2.setOnClickListener(this);
        p3.setOnClickListener(this);
        p4.setOnClickListener(this);
        p5.setOnClickListener(this);
        p6.setOnClickListener(this);
        p7.setOnClickListener(this);
        p8.setOnClickListener(this);
        p9.setOnClickListener(this);
        p10.setOnClickListener(this);
        p11.setOnClickListener(this);
        p12.setOnClickListener(this);
        p13.setOnClickListener(this);
        p14.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.pratical1: {
                intent = new Intent(MainActivity.this,pratical1.class);
                startActivity(intent);
                break;
            }
            case R.id.pratical2: {
                intent = new Intent(MainActivity.this,pratical2.class);
                startActivity(intent);
                break;
            }
            case R.id.pratical3: {
                intent = new Intent(MainActivity.this,pratical3.class);
                startActivity(intent);
                break;
            }
            case R.id.pratical4: {
                intent = new Intent(MainActivity.this,pratical4.class);
                startActivity(intent);
                break;
            }
            case R.id.pratical5: {
                intent = new Intent(MainActivity.this,pratical5.class);
                startActivity(intent);
                break;
            }
            case R.id.pratical6: {
                intent = new Intent(MainActivity.this,pratical6.class);
                startActivity(intent);
                break;
            }
            case R.id.pratical7: {
                intent = new Intent(MainActivity.this,pratical7.class);
                startActivity(intent);
                break;
            }
            case R.id.pratical8: {
                intent = new Intent(MainActivity.this,pratical8.class);
                startActivity(intent);
                break;
            }

            case R.id.pratical9: {
                intent = new Intent(MainActivity.this,practical9.class);
                startActivity(intent);
                break;
            }

            case R.id.pratical10: {
                intent = new Intent(MainActivity.this,practical10.class);
                startActivity(intent);
                break;
            }

            case R.id.pratical11: {
                intent = new Intent(MainActivity.this,practical11.class);
                startActivity(intent);
                break;
            }

            case R.id.pratical12: {
                intent = new Intent(MainActivity.this,practical12.class);
                startActivity(intent);
                break;
            }

            case R.id.pratical13: {
                intent = new Intent(MainActivity.this,practical13.class);
                startActivity(intent);
                break;
            }

            case R.id.pratical14: {
                intent = new Intent(MainActivity.this,practical14.class);
                startActivity(intent);
                break;
            }


        }

    }
}
