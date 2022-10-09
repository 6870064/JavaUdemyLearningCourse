package com.examclouds.ix_oop.tasks;

public class RecursiveNumberOutput {
    public static void main(String[] args) {
        printNumbers(12, 24);
    }

    public static void printNumbers(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i + " ");
            }
        } else {
            for (int i = a; i >= b; i++) {
                System.out.println(i + " ");
            }
        }
    }
}
