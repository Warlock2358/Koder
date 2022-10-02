package Java.Oving6_v2.Tekstanalyse_UtenKokebok;

import java.util.*;

// public class Tekstanalyse {
//     private static int[] antallTegn;
//     private static String[] bokstaver = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
//             "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å" };
//     private static String alf = "abcdefghijklmnopqrstuvwxyzæøå";

//     public Tekstanalyse(String input) {
//         antallTegn = new int[30];
//         for (int i = 0; i < 29; i++) {
//             antallTegn[i] = 0;
//         }

//         input = input.toLowerCase();
//         int lengde = input.length();

//         for (int a = 0; a < lengde; a++) {
//             Character indeksTegn = input.charAt(a);

//             if (alf.equals(bokstaver[a])) {
//                 System.out.println("Er i indeksen")
//             }
//         }
//     }

//     public int getAntallForskjellige() {

//     }

//     public int getAntallBokstaver() {

//     }

//     public double getProsentIkkeBokstaver() {

//     }

//     public int getAntallSpesifikkBokstav(String bokstav) {

//     }

//     public int getFlestForekomster() {

//     }
// }

public class Tekstanalyse {
    private static int[] antallTegn;
    private static String[] bokstaver = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å" };
    private static String alf = "abcdefghijklmnopqrstuvwxyzæøå";
    private static String input = "Hallo på deg din gamle dust";
    private static String k;

    public static void main(String[] args) {
        antallTegn = new int[30];
        for (int i = 0; i < 29; i++) {
            antallTegn[i] = 0;
        }
        input = input.toLowerCase();
        int lengde = input.length();

        for (int a = 0; a < lengde; a++) {
            Character indeksTegn = input.charAt(a);
            int indeks = alf.indexOf(indeksTegn);

            if (indeks > 0) {
                System.out.println(indeksTegn + " er i indeksen");
                antallTegn[indeks]++;
                k = Arrays.toString(antallTegn);
                System.out.println(k);
            } else {
                antallTegn[29]++;
                k = Arrays.toString(antallTegn);
                System.out.println(k);
            }
        }
    }
}
