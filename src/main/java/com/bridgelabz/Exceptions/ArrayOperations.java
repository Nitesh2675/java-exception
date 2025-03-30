package com.bridgelabz.Exceptions;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept array size
            System.out.print("Enter the number of elements in the array: ");
            int size = sc.nextInt();

            // Initialize array
            int[] arr = new int[size];
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Accept index number
            System.out.print("Enter the index to retrieve value: ");
            int index = sc.nextInt();

            // Retrieve and print value
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } finally {
            sc.close();
            System.out.println("Process completed.");
        }
    }
}
