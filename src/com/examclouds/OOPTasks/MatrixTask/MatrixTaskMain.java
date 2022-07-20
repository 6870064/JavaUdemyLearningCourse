package com.examclouds.OOPTasks.MatrixTask;

import static com.examclouds.OOPTasks.MatrixTask.MatrixTask.*;

public class MatrixTaskMain {
    public static void main(String[] args) {
      int m = 4;
      int n = 4;
      int [][]myArray = new int[m][n];
      int [][]myArray2 = new int[m][n];
      int a = 10;
      int b = 20;

      for (int i = 0; i < m; i++) {
          for (int j = 0; j < n;j++) {
              myArray[i][j] = a;
          a++;
          }

          for (int c = 0; c < m; c++){
              for (int f = 0; f < n; f++){
                  myArray2[c][f] = b;
              }
              b++;
          }

      }
        printMatrix(myArray);
      printMatrix(multiplicationMatrix(myArray, 3));
        System.out.println();
        printMatrix(additionMatrix(myArray, myArray2));
    }
}
