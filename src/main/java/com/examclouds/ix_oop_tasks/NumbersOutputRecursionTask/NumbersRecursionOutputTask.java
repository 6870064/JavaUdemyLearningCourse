package com.examclouds.ix_oop_tasks.NumbersOutputRecursionTask;

public class NumbersRecursionOutputTask {

    public static void main(String[] args) {
        Numbers(5, 33);
        System.out.println("======================");
        Numbers(24, 9);
        System.out.println("======================");
        Numbers(45, 45);
    }

    public static void Numbers(int a, int b) {

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
            System.out.println();
        } else if (a > b) {
            for (int i = a; i >= b; i--){
                System.out.println(i);
            }
        } else {
            System.out.println(a+ " is equal to " +b);
        }
    }
}

/* 4. Рекурсивный вывод чисел
        Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания,
        если A < B, или в порядке убывания в противном случае. Использовать рекурсию.
        реализовать введение чисел с клавиатуры, реализовать необходимые Exceptions */