package com.examclouds.OOPTasks.MatrixTask;

public class MatrixTask {
    private static int m = 4 ;
    private static int n = 4;
    int[][] Array = new int[m][n];
    private static int[][] Array2 = new int[m][n];
    private static int[][] Array3 = new int[m][n];

    public MatrixTask(int m, int n, int[][] array) {
        this.m = m;
        this.n = n;
        Array = array;
    }

    public static int[][] additionMatrix(int[][] Array, int[][] Array2) {
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
             Array3[i][j] = Array[i][j] + Array2[i][j];
            }
        }
        return Array3;
    }

    public static void printMatrix(int[][] Array) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicationMatrix(int[][] Array, int d) {

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                Array2[i][j] = Array[i][j] * d;
            }
            System.out.println();
        }
        return Array2;
    }
}


    /* 3. Класс Матрица
Создать класс "Матрица". Класс должен иметь следующие переменные:

двумерный массив вещественных чисел;
количество строк и столбцов в матрице.
Класс должен иметь следующие методы:

сложение с другой матрицей;
умножение на число;
вывод на печать;
умножение матриц - по желанию.
     */


