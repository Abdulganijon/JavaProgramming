package day34_Custom_classes.bankAccount;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setInfo("Abdulgani Mirzoev", 123456789);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();
        System.out.println("--------------------------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Augun", 123456789);
        account2.deposit(10000);
        account2.checkBalance();

    }
}
