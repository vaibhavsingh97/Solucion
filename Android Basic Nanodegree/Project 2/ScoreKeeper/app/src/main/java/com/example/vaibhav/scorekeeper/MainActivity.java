package com.example.vaibhav.scorekeeper;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scoreTeamB;
    int foulCountOfTeamA;
    int foulCountOfTeamB;
    private Button foulButtonA;
    private Button foulButtonB;
    private Button plusThreeButtonA;
    private Button plusTwoButtonA;
    private Button plusOneButtonA;
    private Button freeThrowA;
    private Button plusThreeButtonB;
    private Button plusTwoButtonB;
    private Button plusOneButtonB;
    private Button freeThrowB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foulButtonA = (Button) findViewById(R.id.foul_button_a);
        foulButtonB = (Button) findViewById(R.id.foul_button_b);
        plusThreeButtonA = (Button) findViewById(R.id.plus_three_button_A);
        plusTwoButtonA = (Button) findViewById(R.id.plus_two_button_A);
        plusOneButtonA = (Button) findViewById(R.id.plus_one_button_A);
        freeThrowA = (Button) findViewById(R.id.free_throw_A);
        plusThreeButtonB = (Button) findViewById(R.id.plus_three_button_B);
        plusTwoButtonB = (Button) findViewById(R.id.plus_two_button_B);
        plusOneButtonB = (Button) findViewById(R.id.plus_one_button_B);
        freeThrowB = (Button) findViewById(R.id.free_throw_B);

    }

    public void displayScoreOfTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreOfTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulCountOfA(int count) {
        TextView foulCountView = (TextView) findViewById(R.id.foul_count_a);
        foulCountView.setText(String.valueOf(count));
    }

    public void displayFoulCountOfB(int count) {
        TextView foulCountView = (TextView) findViewById(R.id.foul_count_b);
        foulCountView.setText(String.valueOf(count));
    }

    public void addThreePointsForA(View view) {
        scoreTeamA += 3;
        displayScoreOfTeamA(scoreTeamA);
    }

    public void addTwoPointsForA(View view) {
        scoreTeamA += 2;
        displayScoreOfTeamA(scoreTeamA);
    }

    public void addOnePointForA(View view) {
        scoreTeamA += 1;
        displayScoreOfTeamA(scoreTeamA);
    }

    public void freeThrowButtonForA(View view) {
        scoreTeamA += 1;
        displayScoreOfTeamA(scoreTeamA);
    }

    public void addThreePointsForB(View view) {
        scoreTeamB += 3;
        displayScoreOfTeamB(scoreTeamB);
    }

    public void addTwoPointsForB(View view) {
        scoreTeamB += 2;
        displayScoreOfTeamB(scoreTeamB);
    }

    public void addOnePointForB(View view) {
        scoreTeamB += 1;
        displayScoreOfTeamB(scoreTeamB);
    }

    public void freeThrowButtonForB(View view) {
        scoreTeamB += 1;
        displayScoreOfTeamB(scoreTeamB);
    }

    public void enableButton() {
        foulButtonA.setEnabled(true);
        foulButtonB.setEnabled(true);
        plusThreeButtonA.setEnabled(true);
        plusTwoButtonA.setEnabled(true);
        plusOneButtonA.setEnabled(true);
        freeThrowA.setEnabled(true);
        plusThreeButtonB.setEnabled(true);
        plusTwoButtonB.setEnabled(true);
        plusOneButtonB.setEnabled(true);
        freeThrowB.setEnabled(true);
    }

    public void disableButton() {
        foulButtonA.setEnabled(false);
        foulButtonB.setEnabled(false);
        plusThreeButtonA.setEnabled(false);
        plusTwoButtonA.setEnabled(false);
        plusOneButtonA.setEnabled(false);
        freeThrowA.setEnabled(false);
        plusThreeButtonB.setEnabled(false);
        plusTwoButtonB.setEnabled(false);
        plusOneButtonB.setEnabled(false);
        freeThrowB.setEnabled(false);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulCountOfTeamA = 0;
        foulCountOfTeamB = 0;
        displayScoreOfTeamA(scoreTeamA);
        displayScoreOfTeamB(scoreTeamB);
        displayFoulCountOfA(foulCountOfTeamA);
        displayFoulCountOfB(foulCountOfTeamB);
        enableButton();
        foulButtonA.setText(R.string.foul);
        foulButtonA.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.buttonColor));
        foulButtonB.setText(R.string.foul);
        foulButtonB.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.buttonColor));
    }

    public void addFoulCountOfA(View view) {
        foulCountOfTeamA += 1;
        if (foulCountOfTeamA >= 5) {
            foulButtonA.setText(R.string.disqualify);
            foulButtonA.setBackgroundColor(Color.RED);
            foulButtonA.setEnabled(false);
            disableButton();
        }
        displayFoulCountOfA(foulCountOfTeamA);
    }

    public void addFoulCountOfB(View view) {
        foulCountOfTeamB += 1;
        if (foulCountOfTeamB >= 5) {
            foulButtonB.setText(R.string.disqualify);
            foulButtonB.setBackgroundColor(Color.RED);
            foulButtonB.setEnabled(false);
            disableButton();
        }
        displayFoulCountOfB(foulCountOfTeamB);
    }
}
