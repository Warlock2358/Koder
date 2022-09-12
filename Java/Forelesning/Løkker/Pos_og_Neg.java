package Java.Forelesning.Løkker;

import java.util.Scanner;

public class Pos_og_Neg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tall = 1;
        int pos = 0;
        int neg = 0;

        while (tall != 0) {
            System.out.print("Skriv inn et tall: ");
            tall = in.nextInt();
            if (tall > 0) {
                pos++;
            } else if (tall < 0) {
                neg++;
            }
        }
        System.out.println("Antall positive tall: " + pos);
        System.out.println("Antall negative tall: " + neg);

        in.close();
    }
}
