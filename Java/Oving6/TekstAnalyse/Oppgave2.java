package Java.Oving6.TekstAnalyse;

import java.util.*;

public class Oppgave2 {
    private static boolean sant = true;

    public static void main(String[] args) {
        while (sant) {
            start();
        }
    }

    public static void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv inn en tekst: ");
        String input = in.nextLine();
        TekstAnalyse tekstanalyse = new TekstAnalyse(input);
        analyser(tekstanalyse);
        in.close();
    }

    public static void analyser(TekstAnalyse tekstanalyse) {
        System.out.println("Antall forskjellige bokstaver: " + TekstAnalyse.getAntallForskjellige());
        System.out.println("Antall bokstaver: " + TekstAnalyse.getAntallBokstaver());
        System.out.println("Prosentandel som ikke er bokstaver: " + TekstAnalyse.getProsentIkkeBokstaver() + "%");
        System.out.println(TekstAnalyse.getFlestForekomster());
    }

}
