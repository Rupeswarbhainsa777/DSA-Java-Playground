package Top_100_Coding_Question.Opps_JavaBasics;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1000);

        bankAccount.deposit(100);
        bankAccount.withdraw(150);
        System.out.println( bankAccount.balance()+"Balance");
    }
}
