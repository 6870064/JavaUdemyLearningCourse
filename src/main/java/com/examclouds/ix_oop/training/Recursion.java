package com.examclouds.ix_oop.training;

public class Recursion {
    static int factorial(int n){
        int result;
        if (n < 2){
            return 1;
        }
        result = factorial(n-1) * n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(String.format("Факториал 3: %s",factorial(3)));
        System.out.println(String.format("Факториал 4: %s", factorial(4)));
        System.out.println(String.format("Факториал 5: %s",factorial(5)));
    }
}
