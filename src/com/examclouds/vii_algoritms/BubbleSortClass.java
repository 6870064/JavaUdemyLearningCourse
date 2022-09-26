package com.examclouds.vii_algoritms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSortClass {
    public static void main(String[] args) {
        int[] myArray = arrayCreate(10);
        arraySort(myArray);
    }

    public static int[] arrayCreate(int size){
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = randomGenerator();
        }
        return myArray;
    }

    public static void arraySort(int[] array){
        System.out.println(Arrays.toString(array)+ " => ");
        for (int i = 0; i < array.length -1; i++){
            for (int j = array.length - 1; j > i; j--){
                if (array[j - 1] > array[j]){
                    int tmp = array[j - 1];
                    array[j -1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int randomGenerator(){
        return (int) (Math.random() * 100);
    }
}
