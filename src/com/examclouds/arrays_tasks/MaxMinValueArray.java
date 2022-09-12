package com.examclouds.arrays_tasks;

public class MaxMinValueArray {
    public static void main(String[] args) {
        int[][] myArray =
                {{34, 45, 69, 82, 99, 12, 23, 54},
                        {87, 24, 96, 64, 29, 24, 83, 64},
                        {34, 67, 28, 15, 88, 72, 83, 59},
                        {11, 23, 44, 95, 25, 43, 55, 76},
                        {94, 23, 93, 44, 74, 10, 59, 98}};

        int[][] mySecondArray = new int[5][2];

        int min = 99;
        int max = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {

                if (min > myArray[i][j]) {
                    min = myArray[i][j];
                }
                if (max < myArray[i][j]) {
                    max = myArray[i][j];
                }

                mySecondArray[i][0] = max;
                mySecondArray[i][1] = min;
            }
            min = 99;
            max = 1;

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mySecondArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
5. Поиск максимального и минимального значения в каждой строке массива.
Создать двумерный массив 5х8 типа int и инициализировать его с помощью блока для инициализации.
Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
Распечатать массив, содержащий максимальное и минимальное значение.
 */

/*
myArray[5][8]  i - строка, j - столбец.
 */