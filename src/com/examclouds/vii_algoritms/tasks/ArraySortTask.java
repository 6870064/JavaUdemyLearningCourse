package com.examclouds.vii_algoritms.tasks;

import java.util.Arrays;

public class ArraySortTask {
    public static void main(String[] args) {
        int[] myArray = arrayGenerator(12);
        arrayInvert(myArray);
    }

    public static int[] arrayGenerator(int size) {
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomGenerator();
        }
        return myArray;
    }

    public static void arrayInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static int randomGenerator() {
        return (int) (Math.random() * 100);
    }
}