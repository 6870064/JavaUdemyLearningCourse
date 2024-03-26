package com.examclouds_2024.vi_arrays.tasks;

public class Task3 {
    public static void main(String[] args) {
        String[][] stringArray = new String[3][6];

        for (int i = 0; i < stringArray[0].length; i++) {
            stringArray[0][i] = "a" + (i+1);
        }

        for (int j = 0; j < stringArray[1].length; j++) {
            stringArray[1][j] = "b" + (j+1);
        }

        for (int i = 0; i < stringArray[2].length; i++) {
            stringArray[2][i] = "c" + (i+1);
        }

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[0].length; j++) {
                System.out.print(stringArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}

/*
3. Двумерный массив типа String.
Создать массив типа String размером 3х6.
И записать в него значения:
a1  a2  a3  a4  a5  a6
b1  b2  b3  b4  b5  b6
c1  c2   c3  c4  c5  c6
Распечатать массив.
 */
