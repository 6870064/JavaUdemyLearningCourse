package com.company.arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        fillingMyArray();
        System.out.println();
        fillingSecondArray();
   }

   private static void fillingMyArray(){
        int[][] myArray = new int [4] [4];
        int a = 10;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                myArray [i] [j] = a;
                System.out.print(myArray[i] [j]+ " ");
                a++;
            }
            System.out.println();
        }
   }

    private static void fillingSecondArray() {
        int[][] myArray = new int[4][4];
        int a = 99;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                myArray[i][j] = a;
                System.out.print(myArray[i][j] + " ");
                a--;
            }
            System.out.println();
        }
    }
}

// myArray [i] [j] i - строка; j - столбец
// myArray[1] [2] - 1 строка 2 столбец
/*
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
 */