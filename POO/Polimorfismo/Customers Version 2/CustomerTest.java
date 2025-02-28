public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Juan Castaña", 'm');
        Account account = new Account(1,customer,34.4567);
        System.out.println(account);

        account.deposit(3);
        System.out.println(account);

        account.withdraw(80);

        account.withdraw(3);
        System.out.println(account);
    }
}
