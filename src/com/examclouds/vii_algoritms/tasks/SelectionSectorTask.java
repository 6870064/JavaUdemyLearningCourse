package com.examclouds.vii_algoritms.tasks;

import java.util.Arrays;

public class SelectionSectorTask {
    public static void main(String[] args) {
        int[] myArray = arrayGenerator(12);
        selectionArraySort(myArray);

        int[] myArray1 = arrayGenerator(15);
        selectionArraySort(myArray1);
    }

    public static void selectionArraySort(int[] array) {
        System.out.println(Arrays.toString(array) + " => ");
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
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
