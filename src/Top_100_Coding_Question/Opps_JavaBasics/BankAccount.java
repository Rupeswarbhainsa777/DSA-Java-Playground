package Top_100_Coding_Question.Opps_JavaBasics;

public class BankAccount {

    private double balance;


    BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative.");
        } else {
            balance = initialBalance;
        }

    }

//    deposit, withdraw, and balance;

    public void deposit(double deposit) {
        if (deposit > 0) {
            balance = balance + deposit;
            System.out.println(balance + "deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }

    }

    public void withdraw(double amount) {
        if (amount <= 0) {

            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        }

    }

    public double balance() {
        return balance;
    }

}
