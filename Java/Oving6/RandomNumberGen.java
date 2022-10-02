package Java.Oving6;

import java.util.*;

public class RandomNumberGen {
    private static Random random = new Random();
    private static int rounds = 1000;
    private static int numbers = 10;
    private static int[] amount = new int[numbers];

    public static void main(String[] args) {
        for (int i = 0; i < rounds; i++) {
            int number = random.nextInt(10);
            amount[number]++;
            System.out.println(number + " " + amount[number]);
        }

        for (int i = 0; i < numbers; i++) {
            int sum = amount[i];
            long stars = Math.round(sum / (rounds / 100));
            String star = "";
            for (int j = 0; j < stars; j++) {
                star = star + "*";
            }
            System.out.println(i + ": " + sum + " " + star);
        }
    }

}
