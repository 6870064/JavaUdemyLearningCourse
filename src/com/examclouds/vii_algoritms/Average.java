package com.examclouds.vii_algoritms;

public class Average {
    public static void main(String[] args) {
        double[] myArray = new double[10];
        double result = 0;

        for (double d : myArray) {
            d = randomGenerator();
            result += d;
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println(String.format("Среднее арифметическое массива равно %.2f", result / myArray.length));
    }

    public static double randomGenerator() {
        return Math.random() * 100;
    }
}