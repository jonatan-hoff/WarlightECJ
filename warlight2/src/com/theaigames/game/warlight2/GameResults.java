package com.theaigames.game.warlight2;

/**
 * Created by Jonatan on 28-Sep-15.
 */
public class GameResults {

    private int winner;
    private int score;

    private static final GameResults INSTANCE = new GameResults();

    private void GameResults(){};

    public static GameResults getInstance(){
        return INSTANCE;
    }

    public void setScore(int score){
        this.score = score;
    }

    public void setWinner(int winner){
        this.winner = winner;
    }

    public int getScore(){
        return this.score;
    }

    public int getWinner(){
        return this.winner;
    }
}