package com.wipro.java.usecase3;

import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            initializeBoard();
            boolean gameWon = false;
            int totalMoves = 0;

            while (!gameWon && totalMoves < SIZE * SIZE) {
                printBoard();
                if (playerMove(scanner)) {
                    totalMoves++;
                    gameWon = checkWinner();
                    if (!gameWon) {
                        switchPlayer();
                    }
                }
            }

            printBoard();
            if (gameWon) {
                System.out.println("Player " + currentPlayer + " wins!");
            } else {
                System.out.println("It's a draw!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        scanner.close();
        System.out.println("Thanks for playing Tic-Tac-Toe!");
    }

    // Initialize the board with empty spaces
    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Print the current state of the board
    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Handle player's move
    private static boolean playerMove(Scanner scanner) {
        int row, col;
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column: 1-3): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;

            if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                return true;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    // Switch player from 'X' to 'O' and vice versa
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Check if a player has won
    private static boolean checkWinner() {
        return checkRows() || checkCols() || checkDiagonals();
    }

    // Check rows for a winning combination
    private static boolean checkRows() {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    // Check columns for a winning combination
    private static boolean checkCols() {
        for (int i = 0; i < SIZE; i++) {
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        return false;
    }

    // Check diagonals for a winning combination
    private static boolean checkDiagonals() {
        return (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
               (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]);
    }
}

