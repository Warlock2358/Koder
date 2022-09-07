package Java.Eksperiment;

import java.util.*;

public class Player {
    private Random dice = new Random();
    private int sumPoints;

    public Player(int points) {
        sumPoints = points;
    }

    public int getPoints() {
        return sumPoints;
    }

    public void setPoints(int sumPoints) {
        this.sumPoints = sumPoints;
    }

    public int throwDice(int points) {
        int newSum;

        int n = dice.nextInt(6);
        n += 1;
        if (n == 1) {
            newSum = 0;
        } else if (points > 100) {
            newSum = points - n;
        } else {
            newSum = points + n;
        }
        return newSum;
    }

    public boolean done(int points) {
        if (points == 100) {
            return true;
        } else {
            return false;
        }
    }
}
