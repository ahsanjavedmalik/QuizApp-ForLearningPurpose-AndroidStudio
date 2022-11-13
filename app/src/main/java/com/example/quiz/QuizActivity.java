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
                if (quesNo == 3) {
                    Toast.makeText(QuizActivity.this, "CORRECT! Score= +10", Toast.LENGTH_SHORT).show();
                    score = score + 10;

                }
                quesNo = quesNo + 1;
                NextQuestion();
            }
        });

        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quesNo == 1) {
                    Toast.makeText(QuizActivity.this, "CORRECT! Score= +10", Toast.LENGTH_SHORT).show();
                    score = score + 10;
                }
                quesNo = quesNo + 1;
                NextQuestion();
            }
        });

        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quesNo == 5) {
                    Toast.makeText(QuizActivity.this, "CORRECT! Score= +10", Toast.LENGTH_SHORT).show();
                    score = score + 10;
                }
                quesNo = quesNo + 1;
                NextQuestion();
            }
        });


        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quesNo == 2 || quesNo == 4) {
                    Toast.makeText(QuizActivity.this, "CORRECT! Score= +10", Toast.LENGTH_SHORT).show();
                    score = score + 10;

                }
                quesNo = quesNo + 1;
                NextQuestion();
            }
        });
    }

    private void NextQuestion()
    {
        if(quesNo==2){
            question.setText(" اللہ پاک سے استغفار کس کلمہ میں مانگی گی ہے؟");
            opt1.setText("رد کفر");
            opt2.setText("طیبہ");
            opt3.setText("توحید");
            opt4.setText("استغفار");
        }
        if(quesNo==3){
            question.setText("رد کفر کونسا کلمہ ہے؟");
            opt1.setText("چھٹا");
            opt2.setText("پہلا");
            opt3.setText("تیسرا");
            opt4.setText("دوسرا");
        }

        if(quesNo==4){
            question.setText("کلمہ شہادت کونسا کلمہ ہے؟");
            opt1.setText("چھٹا");
            opt2.setText("پہلا");
            opt3.setText("تیسرا");
            opt4.setText("دوسرا");

        }
        if(quesNo==5){
            question.setText("کلموں کی تعداد کتنی ہے؟");
            opt1.setText("ایک");
            opt2.setText("چار");
            opt3.setText("چھے");
            opt4.setText("پانچ");
        }
        if(quesNo==6){
            question.setText("Thank You So Much! Your Total Score was: " + score);
            opt1.setVisibility(View.GONE);
            opt2.setVisibility(View.GONE);
            opt3.setVisibility(View.GONE);
            opt4.setVisibility(View.GONE);
        }
    }
}
