package Java.Forelesning;

import java.util.Scanner;

public class Beslutningstabeller {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Beslutningstabell");

        System.out.println("Skriv in poengsummen");
        int poeng = in.nextInt();

        if (poeng > 35) {
            if (poeng > 54) {
                if (poeng > 70) {
                    if (poeng > 85) {
                        if (poeng > 95) {
                            System.out.println("Karaktere din er A");
                        } else {
                            System.out.println("Karakteren din er B");
                        }
                    } else {
                        System.out.println("Karakteren din er C");
                    }
                } else {
                    System.out.println("Karakteren din er D");
                }
            } else {
                System.out.println("Karakteren din er E");
            }
        } else {
            System.out.println("Karakteren din er F");
        }

        in.close();
    }

}
