package com.bridgelabz.Exceptions;

import java.util.Scanner;

public class InterestCalculator {
    // Method to calculate interest with exception propagation
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept user input
            System.out.print("Enter the principal amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter the interest rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter the number of years: ");
            int years = sc.nextInt();

            // Calculate interest
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        } finally {
            sc.close();
            System.out.println("Process completed.");
        }
    }
}

