package ej3;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(int id, double balance) {
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
