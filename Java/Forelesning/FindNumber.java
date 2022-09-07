package Java.Forelesning;

import java.util.Random;

public class FindNumber {
    public static void main(String[] args) {
        final int limit1 = 0;
        final int limit2 = 70;
        final int limit3 = 80;
        final int limit4 = 100;

        Random numberGen = new Random();
        int okNumber = 0;
        int tall = limit1 + numberGen.nextInt(limit4 - limit1 + 1);

        while (tall < limit2 || tall > limit3) {
            okNumber++;
            System.out.println(okNumber);
            tall = limit1 + numberGen.nextInt(limit4 - limit1 + 1);
        }

        System.out.println("Vi må trekke " + okNumber + " tall til vi fant et ugyldig. " + okNumber);
    }
}
