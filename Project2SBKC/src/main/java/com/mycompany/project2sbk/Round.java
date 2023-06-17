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
import java.util.Random;

public class Round {
    /**
     *The instance variables in the Round class
     */
    private int secret;
    private int numGuesses;
    private boolean won;
    private Scanner scan;

    /**
     * Constructors takes the value of Scanner inside it parameters inside the
     * constructor, the instance variable are initialized
     *The instance variable secret is to the value of the method generateSecret()
     * @param s
     */
    public Round(Scanner s) {
        secret = generateSecret();
        numGuesses = 0;
        won = false;
        scan = s;
    }

    /**
     * @param g the g inside method compares the guess from the user to the
     * secret number
     * @return compares the guess of the user to secret
     * The method check if every digit of secret and guess are in their respective position
     */
    private boolean checkForSecret(int g) {
        int guess = g;
        if (guess == secret) {
            return true;
        } else {
            int apples = 0;
            int oranges = 0;
            String check_guess = "" + guess;
            String check_secret = "" + this.secret;
            for (int i = 0; i < check_secret.length(); i++) {
                String digit_secret = check_secret.substring(i, i + 1);
                String digit_guess = check_guess.substring(i, i + 1);
                if (digit_guess.equals(digit_secret)) {
                    apples++;
                } else if (check_secret.contains(digit_guess)) {
                    oranges++;
                }
            }
            printResults(apples, oranges);
            return false;
        }
    }

    /**
     * The method prompts the user to enter their guess. The guesses from the
     * user are gathered from the variable guess that is initialized from
     * scan.nextInt
     *
     * @return guess
     */
    private int getGuess() {
        int guess = 0;
        boolean inputOk = false;
        while (inputOk == false) {
            System.out.println("Guess a number or enter - 1 to quit: ");
            guess = scan.nextInt();
            //this is meant to consume the new line 
            scan.nextLine();
            inputOk = guessOk(guess);
        }
        return guess;
    }

    /**
     * the method to play the game with conditions inside of it the variable
     * quitRound is set to false because it is assumed the player wants to play
     *
     */
    public void play() {
        boolean quitRound = false;
        //int guess = getGuess();
        //loops as long as the condition to play the game is true
        while (won == false && quitRound == false) {
            int guess = getGuess();
            //int guess = scan.nextInt();
            if (guess == -1) {
                // System.out.println("You quit the round");
                quitRound = true;

            } else {
                System.out.println("You guessed:" + " " + guess);
                //guess++;
                numGuesses++;
                won = checkForSecret(guess);
            }
        }
        if (won == true) {
            System.out.println("You won the round!");
            //System.out.println("Number of guesses:" + " " + getGuess());
        } else {
            System.out.println("You quit the round");
            //quitRound = true;
            //System.out.println("Number of guesses:" + " " + getGuess());
        }
        System.out.println("Number of guesses:" + " " + numGuesses);
    }

    /**
     * if the user promptly guess the secret number then they will win
     *
     * @return the value of the secret number
     */
    public boolean wonRound() {
        return won;
    }

    /**
     * @return the number of guesses by the users
     */
    public int getNumberGuesses() {
        return numGuesses;
    }
    
    /**
     * verifies the guess from the user to make sure it meets the requirements.
     * The user's guess has to match the conditional statement. 
     */

    private boolean guessOk(int g) {
        /*if(g!=-1 || !hasUniqueDigits(g)){
            System.out.println("Error - guess must have unique digits");
            return false;
        }*/
        // return true;
        if (g != -1 && g < 10000 || g > 99999) {
            System.out.println("Error - guess must be 5 digits");
            return false;
            /**
             * if (!hasUniqueDigits(g)) { System.out.println("Error - guess must
             * have unique digits"); return false;
            }*
             */
        }
        if (!hasUniqueDigits(g)) {
            System.out.println("Error - guess must have unique digits");
            return false;
        }
        return true;
    }

    
    /**
     * When none of the digits from the user's guess are inside secret, then nada will be printed
     * Apple is printed when the digit from the user's guess is in the same position as the digit from the secret number.
     * Orange is printed when the digit from the usr's guess is present in the secret number but not in the same position.
     **/
    private void printResults(int apples, int oranges) {
        if (apples == 0 && oranges == 0) {
            System.out.println("nada");
        } else {
            int i = 1;
            while (i <= apples) {
                //i++;
                System.out.print("" + "apple" + " ");
                i++;

            }
            int j = 1;
            while (j <= oranges) {
                //j++;
                System.out.print("" + "orange" + " ");
                j++;
            }
            System.out.println();
        }
    }

    private boolean hasUniqueDigits(int num) {
        String digits = "" + num;
        for (int i = 0; i < digits.length(); i++) {
            for (int j = i + 1; j < digits.length(); j++) {
                String first_digit = digits.substring(i, i + 1);
                String second_digit = digits.substring(j, j + 1);
                if (first_digit.equals(second_digit)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * generate a secret number
     * @return five digit randomized secret number
     * The math class is used to create the random number.
     * The method hasUniqueDigits is used to ensure the secret number meets the requirements of not having any duplicates
     */
    private int generateSecret() {
        int secret_num = (int) ((Math.random() * 10000) + 90000);
        while (!hasUniqueDigits(secret_num)) {
             secret_num= (int) ((Math.random() * 10000) + 90000);
            
        }
         //System.out.println(secret_num);
        /**
         * int secret_num; String digit = "" + secret_num; for (int i = 0; i <
         * digit.length(); i++) { String first_digit = digit.substring(i, i +
         * 1); if (!digit.startsWith(first_digit) && hasUniqueDigits(secret_num)
         * == true) { secret_num = (int) ((Math.random() * 90000) + 10000); } }
         * return secret_num;
        *
         */
        return secret_num;
    }
}
