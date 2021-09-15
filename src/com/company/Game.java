package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private ArrayList<Player> players = new ArrayList<Player>();
    private int numRounds;
    private int numDice;
    private int roundCount;
    private Scanner scanner = new Scanner(System.in);
//    private Player winner;
    //TODO: Modify winner to include multiple winners

    public Game(int numOfPlayers, int numRounds, int numDice) {
        this.numRounds = numRounds;
        this.numDice = numDice;
        generatePlayers(numOfPlayers);
        startGame();
    }

    private void playerTurn(Player player) {
        int sum = 0;

        for (Die die: player.rollHand()) {
            die.rollDie();
            sum += die.getValue();
            System.out.println(player.getPlayerName() + " rolled " + die.getValue());
        }
        int newScore = sum + player.getPlayerScore();
        player.setPlayerScore(newScore);
        System.out.println(player.getPlayerName() + "'s total score is: " + newScore);
    }
    public void startGame() {

        for (int i = 0; i < numRounds; i++) {
            // Iterates through each Player object in the players Array List
            for (Player player : players) {
                playerTurn(player);
            }

        }
        // Iterates through each Player object in the players Array List

    }

    private void generatePlayers(int numPlayers) {
        for (int i = 0; i < numPlayers ; i++) {
            String name = CLI.getStr("Enter your name\nName: ");
            Player newPlayer = new Player(name, 0);
            players.add(newPlayer);
            Hand hand = new Hand();
            ArrayList<Die> newDice = generateDice();
            hand.setDice(newDice);
            newPlayer.setHand(hand);
        }
    }

    private ArrayList<Die> generateDice() {
        ArrayList<Die> tempArr = new ArrayList<>();

        for (int i = 0; i < numDice; i++) {
            Die newDie = new Die(6);
            tempArr.add(newDie);
        }
        return tempArr;
    }




//    private void getRoundCount() {
//        while(true) {
//            try {
//                System.out.println("How many rounds (min: 1, max: 10)? ");
//                roundCount = scanner.nextInt();
//
//                if(roundCount >= 1 && roundCount <= 10) {
//                    break;
//                }
//
//                System.out.println("Invalid input");
//                scanner.nextLine();
//            }
//            catch(Exception e) {
//                System.out.println("Invalid input");
//                scanner.nextLine();
//            }
//        }
//    }

}
