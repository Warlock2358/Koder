package Java.Oving6.TekstAnalyse;

import java.util.*;

public class TekstAnalyse {
    private static int[] antallTegn;
    private static String[] bokstaver = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å" };

    public TekstAnalyse(String input) {
        antallTegn = new int[30];

        for (int i = 0; i < 30; i++) {
            antallTegn[i] = 0;
        }

        input = input.toLowerCase();
        int lengde = input.length();

        for (int a = 0; a < lengde; a++) {
            char indeksChar = input.charAt(a);
            String bokstav = Character.toString(indeksChar);
            int indeks = Arrays.asList(bokstaver).indexOf(bokstav);
            if (indeks == -1) {
                indeks = 29;
            }
            antallTegn[indeks] += 1;
        }
    }

    public static int getAntallForskjellige() {
        int antall = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > 0) {
                antall++;
            }
        }
        return antall;
    }

    public static int getAntallBokstaver() {
        int antall = 0;
        for (int i = 0; i < 29; i++) {
            antall += antallTegn[i];
        }
        return antall;
    }

    public static double getProsentIkkeBokstaver() {
        int antallBokstaver = getAntallBokstaver();
        int antallIkkeBokstaver = antallTegn[29];
        double total = antallBokstaver + antallIkkeBokstaver;
        double prosent = (antallIkkeBokstaver / total) * 100;
        prosent = Math.round((prosent * 100) / 100);
        return prosent;
    }

    public static int getAntallSpesifikkeBokstaver(String bokstav) {
        int indeks = Arrays.asList(bokstaver).indexOf(bokstav);
        int antall = 0;
        if (indeks > -1) {
            antall = antallTegn[indeks];
        }
        return antall;
    }

    public static String getFlestForekomster() {
        int hoyest = 0;
        String hoyestBokstav = "";
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > hoyest) {
                hoyest = antallTegn[i];
                hoyestBokstav = bokstaver[i];
            } else if (antallTegn[i] == hoyest) {
                hoyestBokstav = hoyestBokstav + ", " + bokstaver[i];
            }
        }
        return "Flest forekomster: " + hoyestBokstav + " (" + hoyest + "ganger)";
    }
}
