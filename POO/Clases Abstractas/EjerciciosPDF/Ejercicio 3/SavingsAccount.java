package ej3;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void deposit(double money) { setBalance(getBalance() + money); }

    @Override
    public void retreat(double money) {
        if (getBalance() > money)
            setBalance(getBalance() - money);
        else
            System.out.println("Saldo insuficiente");
    }
}
