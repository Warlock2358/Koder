package Java.Forelesning.Klasser;

public class Account {

    private final long accountnr;
    private final String name;
    private double balance;

    public Account(long accountnr, String name, double balance) {
        this.accountnr = accountnr;
        this.name = name;
        this.balance = balance;
    }

    public long getAccountnr() {
        return accountnr;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
