package com.bridgelabz.Exceptions;

import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Take user input
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Validate age
            validateAge(age);
        } catch (InvalidAgeException e) {
            // Handle custom exception
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            // Close the scanner
            sc.close();
            System.out.println("Process completed.");
        }
    }
}

