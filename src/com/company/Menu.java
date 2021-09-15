package com.company;

import java.util.Scanner;

public class Menu {

    public static void start(){
        System.out.println("Welcome to the Game!");
        System.out.println("\nDo you want to start a new Game? \npress 1: start \npress 2: exit");
        System.out.print("Choice: ");
        int choice = CLI.getNum(1 , 2);
        if( choice == 1 ){
            System.out.println("How many players?");
            int playerNumber = CLI.getNum(2, 10);
            System.out.println("How many rounds?");
            int numberOfRounds = CLI.getNum(1, 10);
            System.out.println("How many Dice?");
            int numberOfDice = CLI.getNum(1, 10);
            Game newGame = new Game(playerNumber , numberOfRounds , numberOfDice );
        } else if (choice == 2){
            System.out.println("You are now exiting");
        }


    }
    public void exit(){

    }


}
