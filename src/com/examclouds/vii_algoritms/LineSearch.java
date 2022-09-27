package com.examclouds.vii_algoritms;

public class LineSearch {
    public static void main(String[] args) {
        int[] myArray = {11,12,343,43,55,11,9,43,56,32,3};
        int s = 343;
        System.out.println(lineSearch(myArray, s));

        int[] myArray1 = {12,31, 43, 43, 56, 433, 267,926,11, 554, 91};
        System.out.println(lineSearch(myArray1, s));


    }

    public static int lineSearch(int[] array, int elementToSearch){
        for (int i = 0; i < array.length; i++){
            if(array[i] == elementToSearch){
                return i;
            }
            }
        return -1;
        }
    }
