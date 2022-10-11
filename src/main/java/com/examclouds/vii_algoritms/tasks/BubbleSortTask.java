package com.examclouds.vii_algoritms.tasks;

import java.util.Arrays;

public class BubbleSortTask {
    public static void main(String[] args) {

        int[] myArray = arrayGenerator(12);
        bubbleSort(myArray);

        int[] myArray1 = arrayGenerator(14);
        bubbleSort(myArray1);
    }

    public static void bubbleSort(int[] array) {
        System.out.println(Arrays.toString(array) + " => ");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int[] arrayGenerator(int size) {
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomGenerator();
        }
        return myArray;
    }

    public static int randomGenerator() {
        return (int) (Math.random() * 100);
    }
}