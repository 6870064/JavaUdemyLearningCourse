package com.examclouds.vii_algoritms.training;

import java.time.LocalTime;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 25;
        LocalTime LocalTime1 = LocalTime.now();
        System.out.println("Рекурсия " + recursive(n));
    }

    /**
     * Сложность 0(n)
     *
     * @param
     * @return
     */
    private static long calculateWithFor(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i > n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    /**
     * Сложность 0(2^n)
     *
     * @param
     * @return
     */
    private static long recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return recursive(n - 2) + recursive(n - 1);
    }
}
