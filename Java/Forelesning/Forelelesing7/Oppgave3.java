package Java.Forelesning.Forelelesing7;

import java.util.Random;
import java.util.stream.IntStream;

public class Oppgave3 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Random number: " + random.nextInt());

        IntStream intStream = random.ints(5, 500, 5000);
        int[] intArr = intStream.toArray();

        for (int n : intArr) {
            System.out.println(n);
        }
    }
}
