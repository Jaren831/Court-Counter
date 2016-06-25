package com.example.android.courtcounter;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score_one = 0;
    int score_two = 0;
    public void one1(View view) {
        score_one += 1;
        displayScore1(score_one);
    }
    public void two1(View view) {
        score_one += 2;
        displayScore1(score_one);
    }
    public void three1(View view) {
        score_one += 3;
        displayScore1(score_one);
    }
    public void one2(View view) {
        score_two += 1;
        displayScore2(score_two);
    }
    public void two2(View view) {
        score_two += 2;
        displayScore2(score_two);
    }
    public void three2(View view) {
        score_two += 3;
        displayScore2(score_two);
    }
    public void reset(View view) {
        resetScore(0);
    }
    private void resetScore(int number) {
        score_one = 0;
        score_two = 0;
        displayScore1(score_one);
        displayScore2(score_two);
    }
    private void displayScore1(int number) {
        TextView score1TextView = (TextView) findViewById(R.id.score1);
        score1TextView.setText(String.valueOf(number));
    }
    private void displayScore2(int number) {
        TextView score2TextView = (TextView) findViewById(R.id.score2);
        score2TextView.setText(String.valueOf(number));
    }

}
