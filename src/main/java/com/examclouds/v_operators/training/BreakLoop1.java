package com.examclouds.v_operators.training;

public class BreakLoop1 {
    public static void main(String[] args) {
        int i = 0, n = 100;
        while (i < n) {
            if (i ==10) {
                break;
            }
            System.out.println(" i: " +i++);
        }
        System.out.println("ЦикОл завершОн");
    }
}
