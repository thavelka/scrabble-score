package com.thavelka.scrabblescore;

/**
 * Created by tim on 1/24/15.
 */
public class Player {

    private String mName;
    private int mScore;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        mScore = score;
    }

    public Player(String name, int score) {
        mName = name;
        mScore = score;
    }
}
