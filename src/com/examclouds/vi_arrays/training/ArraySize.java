package com.examclouds.vi_arrays.training;

public class ArraySize {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5,6,7,8,9,10};
        int [][] array2 = {{1,1,1}, {2,2,2},{3,3,3,3}};
        System.out.println("Размера массива array1 = " +array1.length);
        System.out.println("Размер массива array2 = " +array2.length);
        System.out.println("Размер 1-й строки массива array2 = " +array2[2].length);
    }
}
