package Java.Forelesning.LeapYear;

import java.util.Scanner;

public class Months {

    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int Year = Integer.parseInt(in.nextLine());
        in.close();

        int[] days_months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (Leap_Year.leapYear(Year)) {
            System.out.println("The year " + Year + " is a leap year");
            days_months[1] = 29;
            for (int i = 0; i < days_months.length; i++) {
                System.out.println("Month " + (i + 1) + " has " + days_months[i] + " days");
            }
        } else {
            System.out.println("The year " + Year + " is not a leap year");
            for (int i = 0; i < days_months.length; i++) {
                System.out.println("Month " + (i + 1) + " has " + days_months[i] + " days");
            }
        }
    }
}
