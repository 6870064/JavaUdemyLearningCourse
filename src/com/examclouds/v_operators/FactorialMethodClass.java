package com.examclouds.v_operators;

public class FactorialMethodClass {
    public static void main(String[] args) {

        countFactorial(0);
        countFactorial(1);
        countFactorial(5);
        countFactorial(10);
    }

    public static void countFactorial(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        System.out.println(String.format("%d - факториал числа %d", factorial, a));
    }
}
