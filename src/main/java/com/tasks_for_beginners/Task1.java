package com.tasks_for_beginners;

public class Task1 {

    public static void main(String[] args) {
    //    toPrintFromOneToHundred();
    //    toPrintFromNToM(1, 1000);
    //    toPrintFromNToM(0, 3);
        toPrintFromNToM(12, 11);
    }

    public static void toPrintFromOneToHundred() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void toPrintFromNToM(int n, int m) {

        if (m >= n) {
            for (int i = n; i <= m; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println(m+ " < " +n+ "Printing is impossible");
        }
    }
}



/*
Напишите программу, которая выводит на экран числа от 1 до 10.
 */