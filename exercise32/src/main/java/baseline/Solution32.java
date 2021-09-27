package baseline;

import java.util.Locale;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jonathan Caques
 */

public class Solution32 {
    public static void main(String[] args) {

        //NumberGame class used to create methods for each level of difficulty to create random numbers in each range
        //String playAgain initialized before while loop; can be changed by user later on, which ends game.
        System.out.println("Let's play Guess the Number!");
        String playAgain = "y";
        while (playAgain.equals("y")) {
            //Prompt for the difficulty level, and then start the game.
            System.out.printf("%nEnter the difficulty level (1, 2, or 3): ");
            Scanner input1 = new Scanner(System.in);
            int option = input1.nextInt();

            if (option == 1) {
                // The computer tracks the number of guesses.
                int guessCounter = 0;
                // The computer picks a random number in that range and prompts the player to guess that number.
                int x = NumberGame.difficulty1();
                System.out.print("I have my number. What's your guess?: ");
                Scanner input2 = new Scanner(System.in);
                int guess = input2.nextInt();
                // Each time the player guesses, the computer should give a hint whether the number is too high or too low.
                while (x != guess) {
                    while (x < guess) {
                        System.out.print("Too high. Guess again: ");
                        Scanner input3 = new Scanner(System.in);
                        guess = input3.nextInt();
                        guessCounter++;
                    }
                    while (x > guess) {
                        System.out.print("Too low. Guess again: ");
                        Scanner input4 = new Scanner(System.in);
                        guess = input4.nextInt();
                        guessCounter++;
                    }
                }
                // If number guessed correctly, output the number of guesses and ask if they would play again.
                if (x == guess) {
                    guessCounter++;
                    System.out.printf("You got it in %d guesses!%n%n", guessCounter);
                    System.out.print("Do you want to play again (Y/N)?: ");
                    Scanner input5 = new Scanner(System.in);
                    playAgain = input5.next().toLowerCase();
                }
            }

            if (option == 2) {
                // The computer tracks the number of guesses.
                int guessCounter = 0;
                // The computer picks a random number in that range and prompts the player to guess that number.
                int x = NumberGame.difficulty2();
                System.out.print("I have my number. What's your guess?: ");
                Scanner input2 = new Scanner(System.in);
                int guess = input2.nextInt();
                // Each time the player guesses, the computer should give a hint whether the number is too high or too low.
                while (x != guess) {
                    while (x < guess) {
                        System.out.print("Too high. Guess again: ");
                        Scanner input3 = new Scanner(System.in);
                        guess = input3.nextInt();
                        guessCounter++;
                    }
                    while (x > guess) {
                        System.out.print("Too low. Guess again: ");
                        Scanner input4 = new Scanner(System.in);
                        guess = input4.nextInt();
                        guessCounter++;
                    }
                }
                // If number guessed correctly, output the number of guesses and ask if they would play again.
                if (x == guess) {
                    guessCounter++;
                    System.out.printf("You got it in %d guesses!%n%n", guessCounter);
                    System.out.print("Do you want to play again (Y/N)?: ");
                    Scanner input5 = new Scanner(System.in);
                    playAgain = input5.next().toLowerCase();
                }
            }

            if (option == 3) {
                // The computer tracks the number of guesses.
                int guessCounter = 0;
                // The computer picks a random number in that range and prompts the player to guess that number.
                int x = NumberGame.difficulty3();
                System.out.print("I have my number. What's your guess?: ");
                Scanner input2 = new Scanner(System.in);
                int guess = input2.nextInt();
                // Each time the player guesses, the computer should give a hint whether the number is too high or too low.
                while (x != guess) {
                    while (x < guess) {
                        System.out.print("Too high. Guess again: ");
                        Scanner input3 = new Scanner(System.in);
                        guess = input3.nextInt();
                        guessCounter++;
                    }
                    while (x > guess) {
                        System.out.print("Too low. Guess again: ");
                        Scanner input4 = new Scanner(System.in);
                        guess = input4.nextInt();
                        guessCounter++;
                    }
                }
                // If number guessed correctly, output the number of guesses and ask if they would play again.
                if (x == guess) {

                    guessCounter++;
                    System.out.printf("You got it in %d guesses!%n%n", guessCounter);
                    System.out.print("Do you want to play again (Y/N)?: ");
                    Scanner input5 = new Scanner(System.in);
                    playAgain = input5.next().toLowerCase();
                }
            }
        }
    }
}

