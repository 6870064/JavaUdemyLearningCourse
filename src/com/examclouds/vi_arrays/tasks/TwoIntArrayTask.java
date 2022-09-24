package com.examclouds.vi_arrays.tasks;

import java.sql.Array;

public class TwoIntArrayTask {
    public static void main(String[] args) {
        int[][] myArray = new int[3][6];
        int d = 0;
        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray[0].length; j++){
                myArray[i][j] = d;
                d++;
                System.out.print(myArray[i][j]+ " ");
            }
            System.out.println();

        }
    }
}
