package com.examclouds.vi_arrays.tasks;

public class ArrayCharTask {
    public static void main(String[] args) {
        char[][] myArray = {{'\u0054', '\u0048'},
            {'\u0051', '\u0058'},
            {'\u0049', '\u0053'},
            {'\u0054', '\u0052'}};

        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray[0].length; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
    }
}
