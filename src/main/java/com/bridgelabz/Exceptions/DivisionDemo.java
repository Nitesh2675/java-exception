package com.bridgelabz.Exceptions;

import java.util.Scanner;

public class DivisionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept user input
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();

            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed. ");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } finally {
            // Ensure this block executes
            sc.close();
            System.out.println("Operation completed.");
        }
    }
}

