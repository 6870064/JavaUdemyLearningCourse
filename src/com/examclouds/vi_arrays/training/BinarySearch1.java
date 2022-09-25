package com.examclouds.vi_arrays.training;

import java.util.Arrays;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] array1 = {5, 14, 32, 44, 51, 67, 43,1};
        Arrays.sort(array1);

        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }

        int pos1 = Arrays.binarySearch(array1, 44);
        int pos2 = Arrays.binarySearch(array1, 67);
        System.out.println(pos1);
        System.out.println(pos2);
    }
}
