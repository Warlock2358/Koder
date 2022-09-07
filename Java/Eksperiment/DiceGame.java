package Java.Eksperiment;

import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        System.out.println("---Dicegame 100---");
        System.out.println("");

        starting();
    }

    public static void starting() {
        System.out.println("Press 1 to play");
        System.out.println("Press 2 to quit");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input == 1) {
            startGame();
        } else if (input == 2) {
            System.out.println("Quitting...");
            System.exit(0);
        } else {
            System.out.println("You've input an incorrect value. Please choose between 1 and 2\n");
            starting();
        }
        in.close();
    }

    public static void startGame() {
        Player[] player = new Player[2];
        player[0] = new Player(0);
        player[1] = new Player(0);

        int roundNr = 0;

        while (!player[0].done(player[0].getPoints()) && player[1].done(player[1].getPoints()) == false) {
            player[0].setPoints(player[0].throwDice(player[0].getPoints()));
            player[1].setPoints(player[1].throwDice(player[1].getPoints()));
            // player[0].setPoints() = player[0].throwDice(player[0].getPoints());
            // player[1].getPoints() = player[1].throwDice(player[1].getPoints());
            System.out.println("Round nr.: " + roundNr + ", player 1: " + player[0].getPoints() + ", player 2: "
                    + player[1].getPoints());
            roundNr += 1;
        }

        if (player[0].done(player[0].getPoints()) == true) {
            System.out.println("\nPlayer 1 won!\n");
        } else {
            System.out.println("\nPlayer 2 won!\n");
        }
        System.out.println("Press 1 to play again");
        System.out.println("Press 2 to quit");

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input == 1) {
            startGame();
        } else if (input == 2) {
            System.out.println("Quitting...");
            System.exit(0);
        } else {
            System.out.println("You've input an incorrect value. Please choose between 1 or 2.\n");
            starting();
        }
        in.close();
    }
}