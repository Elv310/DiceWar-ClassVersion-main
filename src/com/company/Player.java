package com.company;

import java.util.ArrayList;

public class Player {

    private String playerName;
    private int playerScore;
    private Hand hand;


    public ArrayList<Die> rollHand(){
        hand.rollDice();
        return hand.dice;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Player(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }





}
