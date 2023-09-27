package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    // Construtor com três argumentos
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    // Construtor com dois argumentos
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;

    }

    public Account() {
    }

    // Getter number;
    public int getNumber() {
        return number;
    }
    // Getter Number

    // Getter & Setter Holder;
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
    // Getter & Setter Holder;

    // Getter Balance
    public double getBalance() {
        return balance;
    }
    // Getter Balance

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account: " + number
                + " , "
                + "Holder: " + holder
                + " , "
                + "Balance: $ " + String.format("%.2f", getBalance());
    }
}
