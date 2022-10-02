package Java.Oving6_v2.Tekstanalyse_UtenKokebok;

import java.util.*;

public class Tekstanalyse {
    private static int[] antallTegn;
    private static String[] bokstaver = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    public Tekstanalyse(String input) {
        antallTegn = new int[30];
        for (int i = 0; i < 29; i++) {
            antallTegn[i] = 0;
        }

        input = input.toLowerCase();
        int lengde = input.length();

        for (int a = 0; a < lengde; a++) {
            char indeksTegn = input.charAt(a);

        }
    }

    public int getAntallForskjellige() {

    }

    public int getAntallBokstaver() {

    }

    public double getProsentIkkeBokstaver() {

    }

    public int getAntallSpesifikkBokstav(String bokstav) {

    }

    public int getFlestForekomster() {

    }
}
