package Java.Forelesning.LeapYear;

public class Leap_Year {
    public static boolean leapYear(int Year) {
        if (Year % 100 == 0)
            if (Year % 400 == 0)
                return true;
            else
                return false;
        else if (Year % 4 == 0)
            return true;
        else
            return false;
    }
}
