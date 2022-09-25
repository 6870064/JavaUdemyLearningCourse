package com.examclouds.vii_algoritms;

public class SwapMethod {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

       int tmp = a;
       a = b;
       b = tmp;

        System.out.println(String.format("a = %d", a));
        System.out.println(String.format("b = %d", b));
    }
}
