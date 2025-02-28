package ej3;

public abstract class BankAccount {
    private int id;
    private double balance;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() { return id; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public abstract void deposit(double money);
    public abstract void retreat(double money);
}
