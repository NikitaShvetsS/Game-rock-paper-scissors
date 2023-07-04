package org.example;

import java.util.Scanner;

public class Game {

    private Player player;
    private Computer computer;
    public void play() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        player = new Player(name);
        System.out.print("Enter a number of games: ");
        int numOfGames = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfGames; i++) {
            System.out.println("Game " + (i + 1) + ":");
            int userChoice;
            do {
                System.out.print("Enter a number from 1 to 3 (1 - Rock, 2 - Paper, 3 - Scissors): ");
                userChoice = scanner.nextInt();
                scanner.nextLine();

                if (userChoice < 1 || userChoice > 3) {
                    System.out.println("Wrong number! Enter a number from 1 to 3.");
                }
            } while (userChoice < 1 || userChoice > 3);

            computer = new Computer();
            int computerChoice = computer.getMove();
            System.out.println("Computer choice: " + computer.getChoice(computerChoice));

            int result = determineWinner(userChoice, computerChoice);
            if (result == 0) {
                System.out.println("Draw!");
            } else if (result == 1) {
                System.out.println("Won!");
                player.incrementNumsOfWinGames();
            } else {
                System.out.println("Lost!");
                player.incrementNumsOfLostGames();
            }

            player.incrementNumsOfGames();
            System.out.println("---------------------------");
        }

        System.out.println("Result of game: ");
        System.out.println("Games played: " + player.getNumsOfGames());
        System.out.println("Wins: " + player.getNumsOfWinGames());
        System.out.println("Loses: " + player.getNumsOfLoseGames());
    }

    protected int determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return 0;
        } else if ((userChoice == 1 && computerChoice == 2) ||
                (userChoice == 2 && computerChoice == 3) ||
                (userChoice == 3 && computerChoice == 1)) {
            return 1;
        } else {
            return -1;
        }
    }

}
