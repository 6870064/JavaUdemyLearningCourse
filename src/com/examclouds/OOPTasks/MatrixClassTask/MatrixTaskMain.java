package com.examclouds.OOPTasks.MatrixClassTask;

public class MatrixTaskMain {
    public static void main(String[] args) throws java.lang.Exception {

        int[][] A = {{33, 34, 12},
                {33, 19, 10},
                {12, 14, 17},
                {84, 24, 51},
                {43, 71, 21}};

        int[][] B = {{10, 11, 34, 55},
                {33, 45, 17, 81},
                {45, 63, 12, 16}};

        MatrixTask x = new MatrixTask(A);
        MatrixTask y = new MatrixTask(B);

        x.displayMatrix();
        y.displayMatrix();

        MatrixTask mM = MatrixTask.multiply(x, y);
        mM.displayMatrix();


    }
}




/*
https://java.mazurok.com/?tag=%D1%81%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5-%D0%BC%D0%B0%D1%82%D1%80%D0%B8%D1%86
 */