package com.examclouds.preparation;

import java.util.Scanner;

public class StaticBlock {

    public void turnBack(String text, int i) {
    }

    public String turnBack(String text) {

        return text;
    }


    static String a;

    static {
        System.out.println("Static block is initialised");
        System.out.println("Enter any symbol");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("a = " + a);
    }
}

