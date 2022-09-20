package com.examclouds.v_operators;

public class PrintFromOneToHundredNumbersClass {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}
