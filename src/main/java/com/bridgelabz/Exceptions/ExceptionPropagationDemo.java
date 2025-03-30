package com.bridgelabz.Exceptions;

public class ExceptionPropagationDemo {
    // Method that throws an ArithmeticException
    public static void method1() {
        throw new ArithmeticException("Division by zero");
    }

    // Method that calls method1()
    public static void method2() {
        method1();
    }

    public static void main(String[] args) {
        try {
            // Call method2, which propagates exception from method1
            method2();
        } catch (ArithmeticException e) {
            // Handle the exception in main
            System.out.println("Handled exception in main");
        }
    }
}

