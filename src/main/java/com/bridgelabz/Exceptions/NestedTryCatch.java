package com.bridgelabz.Exceptions;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept array size
            System.out.print("Enter the number of elements in the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Accept index
            System.out.print("Enter the index to access: ");
            int index = sc.nextInt();

            try {
                int value = arr[index]; // May throw ArrayIndexOutOfBoundsException

                // Accept divisor
                System.out.print("Enter the divisor: ");
                int divisor = sc.nextInt();

                try {
                    int result = value / divisor; // May throw ArithmeticException
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } finally {
            sc.close();
            System.out.println("Process completed.");
        }
    }
}

