package com.example.quiz;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    Button opt1,opt2,opt3,opt4;
    TextView question;
    int score=0,quesNo=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        question = findViewById(R.id.question);
        opt1 = findViewById(R.id.option1);
        opt2 = findViewById(R.id.option2);
        opt3 = findViewById(R.id.option3);
        opt4 = findViewById(R.id.option4);

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quesNo == 3){
                    Toast.makeText(QuizActivity.this, "CORRECT! Score= +10", Toast.LENGTH_SHORT).show();
                    score = score+10;

                }
                quesNo = quesNo+1;
                NextQuestion();
            }
        });

        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quesNo == 1){
                    Toast.makeText(QuizActivity.this, "CORRECT! Score= +10", Toast.LENGTH_SHORT).show();
                    score = score+10;
                }
                quesNo = quesNo+1;
                NextQuestion();
            }
        });

        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quesNo == 5){
                    Toast.makeText(QuizActivity.this, "CORRECT! Score= +10", Toast.LENGTH_SHORT).show();
                    score = score+10;
                }
                quesNo = quesNo+1;
                NextQuestion();
            }
        });


        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quesNo == 2 || quesNo == 4){
                    Toast.makeText(QuizActivity.this, "CORRECT! Score= +10", Toast.LENGTH_SHORT).show();
                    score = score+10;

                }
                quesNo = quesNo+1;
                NextQuestion();
            }
        });

}
