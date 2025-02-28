package ej3;

public class TestBankAccount {
    public static void main(String[] args) {
        CurrentAccount account = new CurrentAccount(10000, 500);
        SavingsAccount savings = new SavingsAccount(1000, 500);

        account.deposit(2000);
        savings.deposit(2500);

        System.out.println(account.getBalance() + "  " + savings.getBalance());

        account.retreat(2000);
        savings.retreat(2500);

        System.out.println(account.getBalance() + "  " + savings.getBalance());
    }
}
