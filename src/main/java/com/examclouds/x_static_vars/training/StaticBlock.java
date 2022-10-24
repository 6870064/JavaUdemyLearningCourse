package com.examclouds.x_static_vars.training;

import java.util.Scanner;

public class StaticBlock {
    static String a;

    static {
        System.out.println("Static block is initialized");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("a = " + a);
    }
}
