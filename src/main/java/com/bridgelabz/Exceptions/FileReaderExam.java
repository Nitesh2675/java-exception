package com.bridgelabz.Exceptions;

import java.io.*;

public class FileReaderExam{
    public static void main(String[] args) {
        String fileName = "info.txt";

        // Try-with-resources to automatically close BufferedReader
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            // Read and print the first line of the file
            String firstLine = bufferedReader.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

