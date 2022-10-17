package com.examclouds.ix_oop.tasks.iii_matrix;

public class MatrixMain {
    public static void main(String[] args) {
        int m = 6;
        int n = 4;

        int[][] myArray = Matrix.arrayGenerator(m, n);
        Matrix.arrayPrint(myArray);
        Matrix.arraySum(myArray, 10);
        Matrix.arrayPrint(myArray);
        Matrix.arrayMultiply(myArray, 2);
        Matrix.arrayPrint(myArray);
    }
}
