package com.tasks_for_beginners;

public class Task2 {
    public static void main(String[] args) {
//    toSumFromOneToOneHundred();
        toSumFromNToM(1, 500);
    }

    public static void toSumFromOneToOneHundred() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            System.out.println(i+ " " +sum);
        }
    }

    public static void toSumFromNToM(int n, int m) {
        if (m >= n) {
            int sum = 0;
            for (int i = n; i <= m; i++) {
                sum = sum + i;
                System.out.println(i+ " " +sum);
            }
        }
    }
}

/*
Задача 2
Напишите программу, которая находит сумму всех чисел от 1 до 100.
 */