package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game score: ");
        String gameInfo = scanner.nextLine().trim();

        // Separate team names from scores
        String[] parts = gameInfo.split("\\|");

        // Separate the two team names
        String[] teams = parts[0].split(":");

        // Separate the two scores
        String[] scores = parts[1].split(":");

        // Convert score text into numbers
        int firstScore = Integer.parseInt(scores[0].trim());
        int secondScore = Integer.parseInt(scores[1].trim());

        // Compare scores and display the winner
        if (firstScore > secondScore) {
            System.out.println("Winner: " + teams[0].trim());
        } else if (secondScore > firstScore) {
            System.out.println("Winner: " + teams[1].trim());
        } else {
            System.out.println("Winner: Tie!");
        }

        scanner.close();
    }
}