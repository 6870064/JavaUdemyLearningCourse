package com.examclouds.vi_arrays;

import java.util.Arrays;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] myArray = {12, 44, 32, 56, 67, 89, 91};
        int[] myArray2 = {45, 32, 11, 45, 67, 81, 25, 98, 90};
        binarySearch(myArray, 89);
        binarySearch(myArray2, 81);
    }

    public static void binarySearch(int[] array, int a) {

        Arrays.sort(array);
        int pos = Arrays.binarySearch(array, a);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(String.format("%d - позиция элемента %d в массиве", pos, a));
    }
}
