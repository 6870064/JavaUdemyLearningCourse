package com.examclouds.ArraysTasks;

public class TwoDimensionalCharArray {
    public static void main(String[] args) {
        char[][] myArray = {{'\u0054', '\u0048'},
                {'\u0051', '\u0058'},
                {'\u0049', '\u0053'},
                {'\u0054', '\u0052'}};


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(myArray[i][j] +" ");
            }
            System.out.println();
        }
    }
}

//\u0054

/*
4. Двумерный массив типа char.
Создать двумерный массив типа char размером 4х2.
Записать в него значения с помощью блока для инициализации.
Распечатать значения массива.

myArray[4][2]
4 - строка, 2 - столбец
 */