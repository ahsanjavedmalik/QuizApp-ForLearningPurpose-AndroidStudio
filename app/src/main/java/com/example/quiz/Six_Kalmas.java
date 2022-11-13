package com.example.quiz;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Six_Kalmas extends  AppCompatActivity{
    Button first,second,third,fourth,fifth,sixth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalmas);

        first = findViewById(R.id.kalma1btn);
        second = findViewById(R.id.kalma2btn);
        third = findViewById(R.id.kalma3btn);
        fourth = findViewById(R.id.kalma4btn);
        fifth = findViewById(R.id.kalma5btn);
        sixth = findViewById(R.id.kalma6btn);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity1();
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity2();
            }

        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity3();
            }

        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity4();
            }

        });
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity5();
            }

        });

        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity6();
            }

        });

    }


    private void changeActivity1()
    {
        Intent intent = new Intent(this,First_Kalma.class);
        startActivity(intent);
    }
    private void changeActivity2()
    {
        Intent intent = new Intent(this,Second_Kalma.class);
        startActivity(intent);
    }
    private void changeActivity3()
    {
        Intent intent = new Intent(this, Third_Kalma.class);
        startActivity(intent);
    }
    private void changeActivity4()
    {
        Intent intent = new Intent(this, Fourth_Kalma.class);
        startActivity(intent);
    }
    private void changeActivity5()
    {
        Intent intent = new Intent(this, Fifth_Kalma.class);
        startActivity(intent);
    }
    private void changeActivity6()
    {
        Intent intent = new Intent(this, Sixth_Kalma.class);
        startActivity(intent);
    }
}
