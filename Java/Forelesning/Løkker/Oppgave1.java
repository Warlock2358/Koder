package Java.Forelesning.Løkker;

import java.util.*;

public class Oppgave1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hvor mange linjer skal trekanten ha?");
        int numberOfLines = in.nextInt();
        // int numberOfLines = 0;
        String symbol = "*";
        int i = 0;

        while (numberOfLines != 0 && i < numberOfLines) {
            // System.out.println("Prøve");
            int numberOfSymbols = 1 + i;
            String symbols = symbol.repeat(numberOfSymbols);

            System.out.println(symbols);

            i++;
        }

        in.close();
    }
}
