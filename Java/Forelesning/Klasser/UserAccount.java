package Java.Forelesning.Klasser;

public class UserAccount {
    public static void main(String[] args) {
        Account[] account = new Account[2];
        account[0] = new Account(12345678, "Ole Olsen", 1000);
        account[1] = new Account(87654321, "Kari Olsen", 2000);

        System.out.println("Konto nr: " + account[0].getAccountnr() + " og saldoen er: " + account[0].getBalance());
        System.out.println("Konto nr: " + account[1].getAccountnr() + " og saldoen er: " + account[1].getBalance());

        account[0].deposit(500);
        account[1].deposit(1000);

        System.out.println("Konto nr: " + account[0].getAccountnr() + " og saldoen er: " + account[0].getBalance());
        System.out.println("Konto nr: " + account[1].getAccountnr() + " og saldoen er: " + account[1].getBalance());
    }
}
