package com.examclouds.vi_arrays.tasks;

public class arrayTwoStringTask {
    public static void main(String[] args) {
        String[][] myArray= new String[3][6];

        for (int j = 0; j < myArray[0].length; j++){
            myArray[0][j] = "a" + (j+1);
        }

        for (int j = 0; j < myArray[1].length; j++){
            myArray[1][j] = "b" + (j+1);
        }

        for (int j = 0; j < myArray[2].length; j++){
            myArray[2][j] = "c" + (j+1);
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++){
                System.out.print(myArray[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
