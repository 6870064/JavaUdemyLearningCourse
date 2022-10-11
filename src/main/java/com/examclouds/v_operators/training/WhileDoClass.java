package com.examclouds.v_operators.training;

public class WhileDoClass {
    public static void main(String[] args) {
        whileDo(10);
        DoWhile(10);
    }

    public static void whileDo(int a) {
        int i = 0;
        while (i < a) {
            System.out.println(i);
            i++;
        }
        System.out.println("=============");
    }

    public static void DoWhile(int a) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < a);
    }
}


