package com.examclouds.vii_algoritms;

public class ChangeValues2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(String.format("a = %d", a));
        System.out.println(String.format("b = %d",b));
    }
}
