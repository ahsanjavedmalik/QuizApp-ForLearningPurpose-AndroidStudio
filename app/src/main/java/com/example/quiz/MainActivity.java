package com.example.quiz;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    Button repo, learn, quiz;
    ListView mainScreenList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        repo = findViewById(R.id.repobtn);
        learn = findViewById(R.id.learnbtn);
        quiz = findViewById(R.id.quizbtn);


}
    private void toquiz()
    {
        Intent intent = new Intent(this,QuizActivity.class);
        startActivity(intent);
    }
    private void torepo()
    {
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/Hanzala-Iqbal/KIDS-SIX-KALMA-APP-BSEF19M049/tree/master")));
    }
}
