package Java.Oving6_v2.Tekstanalyse_UtenKokebok;

import java.util.*;

import Java.Oving6_v2.Tekstanalyse.Tekstanalyse;

public class Oppgave2 {
    public static void main(String[] args) {
        int k = 1;
        while (k == 1) {
            Scanner in = new Scanner(System.in);
            System.out.println("Tast 1 for å analysere teksten, tast 2 for å avslutte");
            int valg = in.nextInt();

            if (valg == 1) {
                start();
            } else if (valg == 2) {
                System.out.println("Programmet avsluttes");
                System.exit(1);
            } else {
                System.out.println("Ugyldig valg, prøv igjen");
            }
        }
    }

    public static void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv inn en tekst");
        String input = in.nextLine();

        Tekstanalyse tekstanalyse = new Tekstanalyse(input);
    }
}
