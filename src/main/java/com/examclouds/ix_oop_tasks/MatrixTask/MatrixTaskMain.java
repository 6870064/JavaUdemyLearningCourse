package com.examclouds.ix_oop_tasks.MatrixTask;

import com.examclouds.ix_oop_tasks.MatrixClassTask.MatrixTask;

public class MatrixTaskMain {
    public static void main(String[] args) throws Matrix.NotEqualLengthOfMatrixException {

        int [][] A = {{33, 34, 12},
                {33, 19, 10},
                {12, 14,17},
                {84, 24, 51},
                {43, 71, 21}};

        int [][] B = {{10, 11, 34, 55},
                {33, 45, 17, 81},
                {45, 63, 12, 16}};

        Matrix x = new Matrix(A);
        Matrix y = new Matrix(B);

        x.displayMatrix();
        y.displayMatrix();

        MatrixTask mM = Matrix.multiply(x, y);
        mM.displayMatrix();

    }
}
