package com.examclouds.ix_oop;

public class VarArgs3 {
    static void test(boolean... array) {
        System.out.println("test(boolean...array)");
        System.out.println("Количество аргументов: " +array.length);
        for (boolean a : array){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static void test(int...aray){
        System.out.println("test(int... array)");
        System.out.println("Количество аргументов: " +aray.length);
        for (int a: aray){
            System.out.print(a+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test(3);
        test(1,3);
    }
}
