package com.examclouds.v_operators;

import java.util.Random;

public class FactorialRandomClass {
    public static void main(String[] args) {
        int factorial = 1;
        Random random = new Random();
        int i = random.nextInt(6);

        for (int a = 1; a <= i; a++) {
            factorial = factorial * a;
        }
        System.out.println(String.format("Факториал %s равен %s", i, factorial));
    }
}
