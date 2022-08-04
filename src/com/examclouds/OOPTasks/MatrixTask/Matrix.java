package com.examclouds.OOPTasks.MatrixTask;

import com.examclouds.OOPTasks.MatrixClassTask.MatrixTask;

import java.util.Random;

public class Matrix {
    int n, m;
    int[][] mainMatrix;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.mainMatrix = new int[this.n][this.m];
    }

    public Matrix(int[][] paramMatrix) {
        this.n = paramMatrix.length;
        this.m = paramMatrix[0].length;
    }

    public static int[][] transposeMatrix(int[][] paramMatrix) {
        int[][] tmpMatrix = new int[paramMatrix[0].length][paramMatrix.length];
        for (int i = 0; i < paramMatrix[0].length; i++) {
            for (int j = 0; j < paramMatrix.length; j++) {
                tmpMatrix[i][j] = paramMatrix[j][i];
            }
        }
        return tmpMatrix;
    }

    public static Matrix transposeMatrix(Matrix paramMatrix) {
        Matrix tmpMatrix = new Matrix(paramMatrix.m, paramMatrix.n);
        for (int i = 0; i < paramMatrix.m; i++) {
            for (int j = 0; j < paramMatrix.n; j++) {
                tmpMatrix.setElement(i, j, paramMatrix.getElement(j, i));
            }
        }
        return tmpMatrix;
    }

    public static MatrixTask add(MatrixTask first, MatrixTask second) throws NotEqualLengthOfMatrixException {
        if (first.getHorizontalLength() != second.getVerticalLength()) {
            throw new NotEqualLengthOfMatrixException();
        } else {
            MatrixTask tmpMatrix = new MatrixTask(first.getVerticalLength(), second.getVerticalLength());
            for (int i = 0; i < tmpMatrix.getHorizontalLength(); i++) {
                for (int j = 0; j < tmpMatrix.getVerticalLength(); j++) {
                    tmpMatrix.setElement(i, j, first.getElement(i, j) + second.getElement(i, j));
                }
            }
            return tmpMatrix;
        }
    }

    public static MatrixTask substract(MatrixTask first, MatrixTask second) throws NotEqualLengthOfMatrixException {
        if (first.getVerticalLength() != second.getVerticalLength() || first.getHorizontalLength() != second.getHorizontalLength()) {
            throw new NotEqualLengthOfMatrixException();
        } else {
            MatrixTask tmpMatrix = new MatrixTask(first.getVerticalLength(), second.getHorizontalLength());
            for (int i = 0; i < tmpMatrix.getHorizontalLength(); i++) {
                for (int j = 0; j < tmpMatrix.getVerticalLength(); j++) {
                    tmpMatrix.setElement(i, j, first.getElement(i, j) - second.getElement(i, j));
                }
            }
            return tmpMatrix;
        }
    }

    public static MatrixTask multiply(Matrix first, Matrix second) throws NotEqualLengthOfMatrixException {
        if (first.getHorizontalLength() != second.getVerticalLength()) {
            throw new NotEqualLengthOfMatrixException();
        } else {
            MatrixTask tmpMatrix;
            int n = first.getVerticalLength();
            int m = second.getHorizontalLength();
            int o = second.getVerticalLength();
            int[][] tmpArr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < 0; k++) {
                        tmpArr[i][j] += first.getElement(i, k) * second.getElement(k, j);
                    }
                }
            }
            tmpMatrix = new MatrixTask(tmpArr);
            return tmpMatrix;
        }
    }

    public int getElement(int n, int m) {
        return this.mainMatrix[n][m];
    }

    public void setElement(int n, int m, int value) {
        this.mainMatrix[n][m] = value;
    }

    public int getVerticalLength() {
        return this.mainMatrix.length;
    }

    public int getHorizontalLength() {
        return this.mainMatrix[0].length;
    }

    public void fillRandomValues() {
        Random random = new Random();

        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                this.mainMatrix[i][j] = random.nextInt(100);
            }
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                System.out.print(this.mainMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static class NotEqualLengthOfMatrixException extends Exception {
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


