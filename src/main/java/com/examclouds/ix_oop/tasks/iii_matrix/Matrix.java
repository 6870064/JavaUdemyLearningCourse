package com.examclouds.ix_oop.tasks.iii_matrix;

public class Matrix {
    private int[][] myArray;
    private int m;
    private int n;

    public Matrix(int[][] myArray, int m, int n) {
        this.myArray = myArray;
        this.m = m;
        this.n = n;
    }

    public static void arraySum(int[][] array, int a) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] += a;
            }
        }
    }

    public static void arrayMultiply(int[][] array, int a) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = array[i][j] * a;
            }
        }
    }

    public static void arrayPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] arrayGenerator(int m, int n) {
        int[][] myArray = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                myArray[i][j] = randomGenerator();
            }
        }
        return myArray;
    }


    public static int randomGenerator() {
        return (int) (Math.random() * 100);
    }

    public int[][] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[][] myArray) {
        this.myArray = myArray;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
