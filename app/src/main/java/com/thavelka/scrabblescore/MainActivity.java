package com.thavelka.scrabblescore;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private TextView mPlayerOneScore;
    private TextView mPlayerTwoScore;
    Scrabble game;

    public void updateScores() {
        mPlayerOneScore.setText(""+game.playerOneScore());
        mPlayerTwoScore.setText(""+game.playerTwoScore());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = new Scrabble("", "");
        final RelativeLayout welcomeCard = (RelativeLayout) findViewById(R.id.welcomeCard);
        final EditText playerOneField = (EditText) findViewById(R.id.playerOneField);
        final EditText playerTwoField = (EditText) findViewById(R.id.playerTwoField);
        Button submitButton = (Button) findViewById(R.id.submitButton);
        final TextView playerOneName = (TextView) findViewById(R.id.playerOneName);
        final TextView playerTwoName = (TextView) findViewById(R.id.playerTwoName);
        mPlayerOneScore = (TextView) findViewById(R.id.playerOneScore);
        mPlayerTwoScore = (TextView) findViewById(R.id.playerTwoScore);
        final Button playerOneIncOne = (Button) findViewById(R.id.playerOneIncOne);
        final Button playerTwoIncOne = (Button) findViewById(R.id.playerTwoIncOne);
        final Button playerOneIncFive = (Button) findViewById(R.id.playerOneIncFive);
        final Button playerTwoIncFive = (Button) findViewById(R.id.playerTwoIncFive);
        final Button playerOneDecOne = (Button) findViewById(R.id.playerOneDecOne);
        final Button playerTwoDecOne = (Button) findViewById(R.id.playerTwoDecOne);
        final Button playerOneDecFive = (Button) findViewById(R.id.playerOneDecFive);
        final Button playerTwoDecFive = (Button) findViewById(R.id.playerTwoDecFive);
        final Button newGameButton = (Button) findViewById(R.id.newGameButton);
        playerOneName.setText(game.playerOneName());
        playerTwoName.setText(game.playerTwoName());
        updateScores();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.setPlayerOneName(playerOneField.getText().toString());
                game.setPlayerTwoName(playerTwoField.getText().toString());
                playerOneName.setText(game.playerOneName());
                playerTwoName.setText(game.playerTwoName());
                ((RelativeLayout)welcomeCard.getParent()).removeView(welcomeCard);

            }
        });


        playerOneIncOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.playerOneInc();
                updateScores();
            }
        });

        playerTwoIncOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.playerTwoInc();
                updateScores();
            }
        });

        playerOneIncFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.playerOneIncFive();
                updateScores();
            }
        });

        playerTwoIncFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.playerTwoIncFive();
                updateScores();
            }
        });

        playerOneDecOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.playerOneDec();
                updateScores();
            }
        });

        playerTwoDecOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.playerTwoDec();
                updateScores();
            }
        });

        playerOneDecFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.playerOneDecFive();
                updateScores();
            }
        });

        playerTwoDecFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.playerTwoDecFive();
                updateScores();
            }
        });

        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.resetScores();
                updateScores();
            }
        });




    }





}
