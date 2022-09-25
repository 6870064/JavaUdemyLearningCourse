package com.examclouds.vi_arrays.tasks;

public class MaxMinValueArrayTask {
    public static void main(String[] args) {
        int[][] myArray = new int[5][8];
        int[][] maxMinArray = new int[5][2];

        for (int i = 0; i < maxMinArray.length; i++) {
            for (int j = 0; j < maxMinArray[0].length; j++) {
                maxMinArray[i][j] = 0;
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            int max = 1;
            int min = 99;
            for (int j = 0; j < myArray[0].length; j++) {
                myArray[i][j] = randomGenerator();
                
                max = max < myArray[i][j] ? myArray[i][j] : max;
                min = min > myArray[i][j] ? myArray[i][j] : min;

                System.out.print(myArray[i][j] + " ");
                maxMinArray[i][0] = max;
                maxMinArray[i][1] = min;
            }
            System.out.println();
        }

        System.out.println("===================");

        for (int i = 0; i < maxMinArray.length; i++) {
            for (int j = 0; j < maxMinArray[0].length; j++) {
                System.out.print(maxMinArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int randomGenerator() {
        return (int) (Math.random() * 100);
    }
}

/**
 * 5. Поиск максимального и минимального значения в каждой строке массива.
 * Создать двумерный массив 5х8 типа int и инициализировать его с помощью блока для инициализации.
 * Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
 * Распечатать массив, содержащий максимальное и минимальное значение.
 */