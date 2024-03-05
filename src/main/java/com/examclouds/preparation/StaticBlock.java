package com.examclouds.preparation;

import java.util.Scanner;

public class StaticBlock {
    static String a;

    static {
        System.out.println("Static block is initialised");
        System.out.println("Enter any symbol");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("a = " +a);
    }
}
