package com.javcode.arrays;

import java.util.Scanner;

public class ArrrayLauncher {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myArray = new int[10];
        for (int i = 0; i < 10; i++) {
            myArray[i] = (i + 1) * 100;
            System.out.println(myArray[i]);
        }

        int[] myArray2 = {0, 100, 200, 300, 400, 500};
        for (int i = 0; i < myArray2.length; i++) {
            System.out.println("Element #" + i + " = " + myArray2[i]);
        }

        int[] myArray3 = new int[6];
        for (int j = 0; j<myArray3.length;j++){
            System.out.println("Enter value of Array Element #" +j);
            myArray3[j] = scanner.nextInt();
        }

        for (int d = 0; d < myArray3.length; d++){
            System.out.println("Element #" + d + " = " + myArray3[d]);
        }
    }
}
