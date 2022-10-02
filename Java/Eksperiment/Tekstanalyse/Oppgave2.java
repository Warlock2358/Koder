package Java.Eksperiment.Tekstanalyse;

import java.util.*;

class Oppgave2 {
    private static boolean sant = true;

    public static void main(String[] args) {
        while (sant) {
            start();
        }
    }

    public static void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Tast inn teksten som skal analyseres:");
        String input = in.nextLine();
        Tekstanalyse tekstanalyse = new Tekstanalyse(input);
        analyser(tekstanalyse);
    }

    public static void analyser(Tekstanalyse tekstanalyse) {
        System.out.println("Antall forskjellige bokstaver: " + Tekstanalyse.getAntallForskjellige());
        System.out.println("Antall bokstaver: " + Tekstanalyse.getAntallBokstaver());
        System.out.println("Prosentandel som ikke er bokstaver: " + Tekstanalyse.getProsentIkkeBokstaver() + "%");
        System.out.println(Tekstanalyse.getFlestForekomster());

        // Hent antall forekomster av en spesifikk bokstav:
        // System.out.println(tekstanalyse.getAntallSpesifikkBokstav("o"));
    }
}
