package Java.Forelesning;

import static javax.swing.JOptionPane.*;

public class ForelesningKalkulator {

    public static void main(String[] args) {

        String readNumber1 = showInputDialog("Number 1:");
        String readNumber2 = showInputDialog("Number 2:");

        int number1 = Integer.parseInt(readNumber1);
        int number2 = Integer.parseInt(readNumber2);

        int choice = showConfirmDialog(null, "Plus?", "Calculator", YES_OPTION);

        int answer = 0;

        if (choice == YES_OPTION) {
            answer = number1 + number2;
        } else {
            answer = number1 - number2;
        }

        showMessageDialog(null, "Answer " + answer);
    }
}
