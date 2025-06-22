package Test2.Challenge_4;

public class main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);


        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000);
        account.deposit(-100);
        account.withdraw(-50);

        System.out.println("Final Balance: " + account.getBalance());
    }


}
