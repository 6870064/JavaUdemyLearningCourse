package com.examclouds.iii_language_vocabulary.training;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число");
        if (scanner.hasNextDouble()) {
            double i = scanner.nextDouble();
            System.out.println(i);
        }
        System.out.println("Вы ввели недробное число");
    }
}
