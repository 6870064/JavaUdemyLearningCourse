package com.company.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySorting {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = new int[6];
        boolean continueLoop = true;

        do {
            try {
                for (int i = 0; i < myArray.length; i++) {
                    System.out.println("Enter Array element #" + i);
                    myArray[i] = scanner.nextInt();
                    if (i == 5) {
                        continueLoop = false;
                    }
                }
            } catch (ArithmeticException | NullPointerException | InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Only non-zero integer parameters are allowed");
            }
        } while (continueLoop);

        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Element #" + j + " : " + myArray[j]);
        }
        System.out.println("=======================");

int [] array = sort(myArray);
        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Element #" +j+ " = " +myArray[j]);
        }
    }

  private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length-1; j++){
                if (array[j] > array[j + 1]) {
                    int temp = array [j];
                    array[j] = array [j +1];
                    array [j +1] = temp;
                }
            }
        }
return array;
    }
}
