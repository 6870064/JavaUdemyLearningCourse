package com.examclouds.InputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
    private static final String fileName = "scan.txt";

    public static void main(String[] args) {
        makeFile();
        scanFile();
    }

    public static void scanFile() {
        try (FileReader fileReader = new FileReader(fileName);
             Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    System.out.println(scanner.nextInt() + " :int");
                } else if (scanner.hasNextDouble()) {
                    System.out.println(scanner.nextDouble() + ": double");
                } else if (scanner.hasNextBoolean()) {
                    System.out.println(scanner.hasNextBoolean() + ": boolean");
                } else {
                    System.out.println(scanner.next() + " :String");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void makeFile() {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write("2 java 1,5 true 1.6");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
