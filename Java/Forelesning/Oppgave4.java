package Java.Forelesning;

public class Oppgave4 {
    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int p = 20;
        int q = 40;
        int r = 30;
        int s = 15;

        if (a < b) {
            a = b;
        }
        b = 10;
        if (p == 20) {
            q = 13;
        } else {
            q = 17;
        }
        if (r > s) {
            q = 100;
        }

        s = 200;

        System.out.println(q);
    }
}
