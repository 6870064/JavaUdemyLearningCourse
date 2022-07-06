package com.company.arrays;

import java.util.Scanner;

public class ArraySecondLauncher {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = new int[6];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Please enter value for Array element #" + i);
            myArray[i] = scanner.nextInt();
        }

        int [] array = sort(myArray);
        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Element #" + j + " = " + myArray[j]);
        }
    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
