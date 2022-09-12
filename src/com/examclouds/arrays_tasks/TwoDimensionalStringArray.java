package com.examclouds.arrays_tasks;

public class TwoDimensionalStringArray {
    public static void main(String[] args) {
        String[][] myArray = new String[3][6];
        int a = 1;

        for (int j = 0; j < 6; j++) {
            myArray[0][j] = "a" + a;
            System.out.print(myArray[0][j] + " ");
            a++;
        }

        a = 1;
        System.out.println();

        for (int j = 0; j < 6; j++) {
            myArray[1][j] = "b" + a;
            System.out.print(myArray[1][j] + " ");
            a++;
        }

        a = 1;
        System.out.println();

        for (int j = 0; j < 6; j++) {
            myArray[2][j] = "c" + a;
            System.out.print(myArray[2][j] + " ");
            a++;
        }
    }
}

/*
myArray[i] [j]
i - строка, j - столбец
 */

/*
3. Двумерный массив типа String.
Создать массив типа String размером 3х6.
И записать в него значения:
a1  a2  a3  a4  a5  a6
b1  b2  b3  b4  b5  b6
c1  c2   c3  c4  c5  c6
Распечатать массив.
 */