package com.examclouds.ix_oop;

public class VarArgs {
    static void test(int...array){
        System.out.println("Количество аргументов: " +array.length);
        for (int a: array){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test();
        test(1);
        test(2,3);
        test(new int[]{1,3});
    }
}
