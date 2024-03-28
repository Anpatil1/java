package Assigmnent.oops.polymorphism;

import lombok.Getter;

// Write a Java program to create a base class BankAccount with methods deposit() and withdraw().
// Create two subclasses SavingsAccount and CheckingAccount.
// Override the withdraw() method in each subclass to impose different withdrawal limits and fees.
@Getter
class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(double initialBalance, double withdrawalLimit) {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal limit exceeded for savings account.");
        } else {
            super.withdraw(amount);
        }
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalFee;

    public CheckingAccount(double initialBalance, double withdrawalFee) {
        super(initialBalance);
        this.withdrawalFee = withdrawalFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount + withdrawalFee > balance) {
            System.out.println("Insufficient funds to cover withdrawal fee.");
        } else {
            balance -= (amount + withdrawalFee);
            System.out.println(amount + " withdrawn successfully. Withdrawal fee: " + withdrawalFee);
        }
    }
}

public class polymorphismexample8 {
    public static void main(String[] args) {
        // Test BankAccount
        BankAccount account1 = new BankAccount(1000);
        account1.deposit(500);
        account1.withdraw(200);
        System.out.println("Current balance: " + account1.getBalance());

        // Test SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(2000, 100);
        savingsAccount.withdraw(50);  // Within limit
        savingsAccount.withdraw(150); // Exceeding limit

        // Test CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount(3000, 20);
        checkingAccount.withdraw(100);  // Withdrawal fee applied
        checkingAccount.withdraw(300);  // Insufficient funds for withdrawal fee
    }
}
