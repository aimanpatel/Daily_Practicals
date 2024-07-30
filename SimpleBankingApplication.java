//Write a Java program to simulate a simple banking application.

package com.Lab20;
import java.util.Scanner;

//BankAccount class to represent a bank account
class BankAccount {
 private double balance; // balance of the bank account

 // Constructor to initialize the balance
 public BankAccount(double initialBalance) {
     if (initialBalance >= 0) {
         this.balance = initialBalance;
     } else {
         throw new IllegalArgumentException("Initial balance must be non-negative.");
     }
 }

 // Method to deposit money into the account
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: $" + amount);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 // Method to withdraw money from the account
 public void withdraw(double amount) {
     if (amount > 0) {
         if (balance >= amount) {
             balance -= amount;
             System.out.println("Withdrawn: $" + amount);
             System.out.println("Current Balance: $" + balance);
         } else {
             System.out.println("Insufficient funds. Withdrawal amount exceeds balance.");
         }
     } else {
         System.out.println("Withdrawal amount must be positive.");
     }
 }

 // Method to get the current balance of the account
 public double getBalance() {
     return balance;
 }
}

//Main class to test the BankAccount class
public class SimpleBankingApplication {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new BankAccount with initial balance
        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        // Menu for banking operations
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n**** Banking Menu ****");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using our banking application!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }

        scanner.close();
    }

}
