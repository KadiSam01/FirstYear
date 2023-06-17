/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.project1sbk;

import java.util.Scanner;

/**
 *
 * @author Samuel Kadima
 */
public class Project1SBK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int gameScore = 0;
        int gameRolls = 0;
        int roundScore = 0;
        int roundRolls = 0;
        int knockoutNumber;
        boolean stopGame = false;
        boolean stopRound = false;
        int i = -1;
        System.out.println("Enter knockout number (1-6): ");

        knockoutNumber = sc.nextInt();
        sc.nextLine();
        //String user_response;

        //boolean stopRound;
        while (stopGame == false && gameScore < 100) {
            i++;
            // roundRolls = 0;
            // roundScore = 0;
            stopGame = false;
            //gameScore = 0;
            // gameRolls = 0;
            System.out.println("Begin Round " + " " + i);
            stopRound = false;
            while (stopRound == false) {
                roundRolls++;
                int firstDice = (int) (Math.random() * 6) + 1;
                int secondDice = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled" + " " + firstDice + " " + "and" + " " + secondDice + ".");
                /*System.out.println("Roll again?" + " ");

                String user_response = sc.nextLine();
                if (user_response.equals("n")) {
                    stopRound = true;
                    //stopGame = true;
                }*/
                if (firstDice == knockoutNumber && secondDice == knockoutNumber) {
                    roundScore = 25;
                    System.out.println("Busted");
                    stopRound = true;
                } else if (firstDice == secondDice && firstDice != knockoutNumber && secondDice != knockoutNumber) {
                    roundScore = (roundScore + firstDice + secondDice) * 2;
                    System.out.println("Bonus");
                    System.out.println("Roll Again?" + " ");
                    String user_response = sc.nextLine();
                    if (user_response.equals("n")) {
                        stopRound = true;
                    }
                    // roundScore = roundScore + firstDice + secondDice;

                    System.out.println("Stop?" + " ");
                    String stopGameResponse = sc.nextLine();
                    if (stopGameResponse.equals("y")) {
                        stopRound = true;
                        stopGame = true;
                        // roundScore = roundScore + firstDice + secondDice;
                    }
                } else if (firstDice == knockoutNumber || secondDice == knockoutNumber) {
                    stopRound = true;
                    //roundScore = roundScore + firstDice + secondDice;

                    //System.out.println("Roll Again?" + " ");
                } /*else if(firstDice!=knockoutNumber || secondDice != knockoutNumber){
                    roundScore = roundScore + firstDice + secondDice;
                    //stopRound = true;
                }*/ /*else if (firstDice != knockoutNumber || secondDice != knockoutNumber){
                    stopRound = true;
               
                /*System.out.println("Roll Again?" + "");
                user_response = sc.nextLine();
                if (user_response.equals("n")) {
                    stopRound = true;
                }
                }*/ else {
                    System.out.println("Roll Again?" + " ");
                    String user_response = sc.nextLine();
                    if (user_response.equals("n")) {
                        stopRound = true;
                    }
                    // roundScore = roundScore + firstDice + secondDice;
                    System.out.println("Stop?" + " ");
                    String stopGameResponse = sc.nextLine();
                    if (stopGameResponse.equals("y")) {
                        stopRound = true;
                        stopGame = true;
                        // roundScore = roundScore + firstDice + secondDice;
                    }
                    roundScore = roundScore + firstDice + secondDice;
                }
                //roundScore = roundScore + firstDice + secondDice;

                //gameScore+=roundScore;
                //gameRolls+=roundRolls;
            }
            gameScore += roundScore;
            gameRolls += roundRolls;

            System.out.println("Round " + i + " " + "over." + " " + "You rolled" + " " + roundRolls + " " + "time(s)" + " " + "Round " + i + " " + " " + "score was" + " " + roundScore);
            System.out.println("Overall game score is " + gameScore);

            roundRolls = 0;
            roundScore = 0;
            //stopRound = false;
        }
        //gameScore += roundScore;
        //gameRolls += roundRolls;
        System.out.println("Game over." + " " + "Overall," + " " + " you" + " " + "rolled" + " " + gameRolls + " " + "" + "times(s)" + " " + "Game Score" + " " + "was" + " " + gameScore);
        if (gameScore >= 100) {
            System.out.println("Congrats on your high score");
        } else {
            System.out.println("Better luck next time");
        }
        /*else {
            System.out.println("Roll Again?" + " ");
            String user_response = sc.nextLine();
            if (user_response.equals("n")) {
                System.out.println("Better luck next time");
                //stopRound = true;
                stopGame = true;
                /*System.out.println("Stop game?" + " ");
                if(user_response.equals("n")){
                System.out.println("Better luck next time");
                stopGame = true;
                }*/
    }
    /**
     * else{ System.out.println("Stop game" + " "); String stopgame =
     * sc.nextLine(); if(stopgame.equals("n")){ stopGame = true; } }*
     */
}
