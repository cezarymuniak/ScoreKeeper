package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int faulTeamA = 0;
    int faulTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the faul for Team A by 1 points.
     */
    public void addFaulForTeamA(View v) {


        faulTeamA = faulTeamA + 1;
        displayFaulTeamA(faulTeamA);


    }

    /**
     * Displays the given faul for Team A.
     */
    public void displayFaulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fauls);
        scoreView.setText(String.valueOf("Fauls:" + score));
    }


    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);


    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the faul for Team B by 1 points.
     */
    public void addFaulForTeamB(View v) {


        faulTeamB = faulTeamB + 1;
        displayFaulTeamB(faulTeamB);
    }

    /**
     * Displays the given faul for Team B.
     */
    public void displayFaulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fauls);
        scoreView.setText(String.valueOf("Fauls:" + score));
    }

    /**
     * Reset the score for Teams .
     */
    public void resetTeams(View v) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

        faulTeamA = 0;
        faulTeamB = 0;
        displayFaulTeamA(faulTeamA);
        displayFaulTeamB(faulTeamB);


    }


}