/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2sbk;

/**
 *
 * @author Samuel Kadima
 */
import java.util.Scanner;

/**
 * The Game class allows the user to play the guessing game
 * The class has multiple rounds depending on the player choice to play or not
 * The class is consisted of instance variables and a method to allow for the function of the class
 */

public class Game {
    
    /**
     *All the important instance variables for the Game class
     */
    private Scanner scan;
    private int numGuesses;
    private int numRoundsWon;

    /**
     * the Game constructor initializes all the private instances
     */
    public Game() {
        scan = new Scanner(System.in);
        numGuesses = 0;
        numRoundsWon = 0;
    }

    /**
     * the play methods
     * the important part of the method is the while loop
     * the while loop checks rather the user has decided not to quit the game.
     * It also uses conditional statement to check for certain conditions during the game.
     * One example is when the player wins the round then it will stop the game
     */
    public void play() {
        boolean quitGame = false;
        while (quitGame == false) {
            Round r = new Round(scan);
            r.play();
            if (r.wonRound() == true) {
                numGuesses = numGuesses + r.getNumberGuesses();
                numRoundsWon++;
            }
            System.out.println("Do you want to continue playing? " + " " + "Enter y or n: " + " ");
            String response = scan.nextLine();
            if (response.equals("n")) {
                quitGame = true;
            }
        }
        System.out.println("Number of rounds won:" + numRoundsWon);
        if (numRoundsWon == 0) {
            System.out.println("Average # of guesses:" + " " + "0.0");
        } else {
            double average = (double) numGuesses / numRoundsWon;
            System.out.println("Average # of guesses:" + " "+ average);
        }
    }
}
