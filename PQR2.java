//Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
package com_javapgm;

import java.util.ArrayList;
import java.util.List;

// Account.java - Interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

// SavingsAccount.java - Implementing Account interface
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    // Unique method for SavingsAccount
    public void transfer(double amount, Account destination) {
        withdraw(amount);
        destination.deposit(amount);
    }
}

// CurrentAccount.java - Implementing Account interface
class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public double calculateInterest() {
        // Current accounts typically do not earn interest
        return 0;
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    // Unique method for CurrentAccount
    public void issueOverdraft(double amount) {
        balance -= amount;
    }
}

// Bank.java
class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

// Main.java
public class PQR2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        savingsAccount.deposit(500);
        currentAccount.withdraw(200);

        System.out.println("Savings Account Balance: " + savingsAccount.viewBalance());
        System.out.println("Current Account Balance: " + currentAccount.viewBalance());
    }
}
