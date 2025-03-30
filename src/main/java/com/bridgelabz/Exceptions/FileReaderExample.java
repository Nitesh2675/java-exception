package com.bridgelabz.Exceptions;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "src/main/java/com/bridgelabz/Exceptions/data.txt";

        // Try-with-resources to ensure proper resource management
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            // Read and print file contents line by line
            String line;
            while (( line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("File not found");
        } catch (IOException e) {
            // Handle other IO exceptions
            System.out.println("An error occurred while reading the file");
        }
    }
}


