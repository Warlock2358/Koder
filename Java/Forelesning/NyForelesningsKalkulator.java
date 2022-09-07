package Java.Forelesning;

import static javax.swing.JOptionPane.*;

public class NyForelesningsKalkulator {
    public static void main(String[] args) {

        double number1 = 12;
        double number2 = 5;

        int selection = showConfirmDialog(null, "Legge sammen?", "Calculator", YES_OPTION);

        String result = "\nThe answer is ";

        if (selection == YES_OPTION) {
            double answer = number1 + number2;
            result += answer;
        } else {
            double answer = number1 - number2;
            result += answer;
        }

        showMessageDialog(null, result);
    }
}
