package com.examclouds.vii_algoritms;

import java.util.Arrays;

public class arrayInverterClass {
    public static void main(String[] args) {
        int[] myArray = createArray(10);
        arrayInvert(myArray);

        int[] myArray1 = createArray(12);
        arrayInvert(myArray1);

        int[] myArray2 = createArray(15);
        arrayInvert(myArray2);
    }

    public static int[] createArray(int size) {
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomGenerator();
        }
        return myArray;
    }

    public static void arrayInvert(int[] array) {
        System.out.println(Arrays.toString(array) + " => ");
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
