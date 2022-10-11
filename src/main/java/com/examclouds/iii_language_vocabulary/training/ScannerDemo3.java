package com.examclouds.iii_language_vocabulary.training;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        System.out.println("Введите текст первой строки");
        s1 = scanner.nextLine();
        System.out.println("Введите текст второй строки");
        s2 = scanner.nextLine();
        System.out.println(s1+ "\n" +s2);
    }
}
