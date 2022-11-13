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
}
