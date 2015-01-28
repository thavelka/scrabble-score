package com.thavelka.scrabblescore;

/**
 * Created by tim on 1/24/15.
 */
public class Scrabble {

    private Player mPlayerOne;
    private Player mPlayerTwo;

    public int playerOneScore() {return mPlayerOne.getScore();}
    public int playerTwoScore() {return mPlayerTwo.getScore();}
    public String playerOneName() {return mPlayerOne.getName();}
    public String playerTwoName() {return mPlayerTwo.getName();}
    public void setPlayerOneName(String name) {mPlayerOne.setName(name);}
    public void setPlayerTwoName(String name) {mPlayerTwo.setName(name);}

    public void playerOneInc() {mPlayerOne.setScore(mPlayerOne.getScore()+1);}
    public void playerTwoInc() {mPlayerTwo.setScore(mPlayerTwo.getScore()+1);}
    public void playerOneIncFive() {mPlayerOne.setScore(mPlayerOne.getScore()+5);}
    public void playerTwoIncFive() {mPlayerTwo.setScore(mPlayerTwo.getScore()+5);}
    public void playerOneDec() {mPlayerOne.setScore(mPlayerOne.getScore()-1);}
    public void playerTwoDec() {mPlayerTwo.setScore(mPlayerTwo.getScore()-1);}
    public void playerOneDecFive() {mPlayerOne.setScore(mPlayerOne.getScore()-5);}
    public void playerTwoDecFive() {mPlayerTwo.setScore(mPlayerTwo.getScore()-5);}

    public void resetScores() {mPlayerOne.setScore(0); mPlayerTwo.setScore(0);}

    public Scrabble(String nameOne, String nameTwo) {
        mPlayerOne = new Player(nameOne, 0);
        mPlayerTwo = new Player(nameTwo, 0);
    }
}
