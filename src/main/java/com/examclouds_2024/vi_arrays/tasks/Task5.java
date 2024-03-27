package com.examclouds_2024.vi_arrays.tasks;

public class Task5 {
    public static void main(String[] args) {
        int[][] intArray = {
                {45, 1, 3, 99, 22, 44, 43, 32},
                {23, 4, 7, 67, 98, 3, 23, 32},
                {54, 32, 54, 21, 34, 2, 87, 65},
                {32, 28, 43, 11, 24, 21, 77, 45},
                {76, 32, 14, 41, 74, 54, 7, 95}
        };

        int[][] minMaxArray = new int[5][2];

        for (int i = 0; i < intArray.length; i++) {
            int min = intArray[i][0];
            int max = intArray[i][0];
            for (int j = 0; j < intArray[0].length; j++) {
                if (min > intArray[i][j]) {
                    min = intArray[i][j];
                }
                if (max < intArray[i][j]) {
                    max = intArray[i][j];
                }
            }
            minMaxArray[i][0] = min;
            minMaxArray[i][1] = max;
        }

        System.out.println("Печать исходного массива");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[0].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Печать массива, содержащего максимальное и минимальное значение.");
        for (int i = 0; i < minMaxArray.length; i++) {
            for (int j = 0; j < minMaxArray[0].length; j++) {
                System.out.print(minMaxArray[i][j] + " ");
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
