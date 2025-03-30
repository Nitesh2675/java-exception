package com.bridgelabz.Exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Prompt user for two numbers
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();

            // Perform division and display result
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            // Handle non-numeric input
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            // Close the scanner
            sc.close();
        }
    }
}
