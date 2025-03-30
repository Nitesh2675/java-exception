package com.bridgelabz.Exceptions;

import java.util.Scanner;

import java.util.Scanner;

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Initialize account with a balance
            System.out.print("Enter initial balance: ");
            double initialBalance = sc.nextDouble();
            BankAccount account = new BankAccount(initialBalance);

            // Accept withdrawal amount
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            // Perform withdrawal
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } finally {
            sc.close();
            System.out.println("Transaction completed.");
        }
    }
}
