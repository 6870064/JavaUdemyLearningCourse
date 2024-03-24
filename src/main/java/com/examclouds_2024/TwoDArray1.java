package com.examclouds_2024;

public class TwoDArray1 {
    public static void main(String[] args) {
        int[][] twoD = new int[5][4];
        int k = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <4; j++) {
                twoD[i][j] = k++;
                System.out.println(twoD[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
