package com.wipro.game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Database db;
    private Scanner scanner;

    public Game() {
        db = new Database();
        scanner = new Scanner(System.in);
    }

    public void playGame() {
        System.out.println("Welcome to the Number Guessing Game!");

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        // Random number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfAttempts = 0;
        int guessedNumber = 0;

        System.out.println("Try to guess the number between 1 and 100.");

        // Keep guessing until correct
        while (guessedNumber != numberToGuess) {
            System.out.print("Enter your guess: ");
            guessedNumber = scanner.nextInt();
            numberOfAttempts++;

            if (guessedNumber < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guessedNumber > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + numberOfAttempts + " attempts.");
            }
        }

        // Update score (lower attempts mean a higher score)
        int score = Math.max(100 - numberOfAttempts, 0); // Score: 100 minus attempts, with a minimum score of 0
        System.out.println(playerName + ", your final score is: " + score);

        // Update score in the database
        db.updateScore(playerName, score);
    }

    public void displayScores() {
        db.displayScores();
    }

    public void close() {
        db.close();
        scanner.close();
    }

    public static void main(String[] args) {
        Game game = new Game();

        game.playGame();
        game.displayScores();
        game.close();
    }
}

