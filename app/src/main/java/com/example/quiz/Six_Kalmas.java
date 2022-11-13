package com.example.quiz;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Six_Kalmas extends  AppCompatActivity{
    Button first,second,third,fourth,fifth,sixth;



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
