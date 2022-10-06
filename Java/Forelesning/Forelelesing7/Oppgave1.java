package Java.Forelesning.Forelelesing7;

import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String myStr = scanner.nextLine();

            String[] words = myStr.split(" ");

            System.out.println("You typed: " + myStr);
            System.out.println("Words " + words.length);

            int totalDigits = 0;
            int totalAlpha = 0;
            for (int i = 0; i < myStr.length(); i++) {
                // Check if digit
                char c = myStr.charAt(i);
                if (Character.isDigit(c)) {
                    totalDigits++;
                }

                // Check if letter
                if (Character.isAlphabetic(c)) {
                    totalAlpha++;
                }

            }
            System.out.println("Total digits: " + totalDigits);
            System.out.println("Total alphanumerics: " + totalAlpha);
        }
    }
}
