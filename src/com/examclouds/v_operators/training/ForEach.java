package com.examclouds.v_operators.training;

public class ForEach {
    public static void main(String[] args) {
        int[] myArray = {654, 4562, 1123, 54, 567, 986, 112, 11, 5, 3, 113445, 543, 45664};
        int[] myArray1 = {112, 1234, 4567, 324, 45353, 2245, 4, 654, 653, 432, 566, 654322, 112344554};

        minArrayValueCount(myArray);
        maxArrayValueCount(myArray);
        minArrayValueCount(myArray1);
        maxArrayValueCount(myArray1);
    }

    public static void minArrayValueCount(int[] array) {
        int min = array[0];
        for (int i : array) {
            min = min > i ? i : min;
        }
        System.out.println(String.format("Minimum value of the array is %d", min));
    }

    public static void maxArrayValueCount(int[] array) {
        int max = array[0];
        for (int i : array) {
            max = max < i ? i : max;
        }
        System.out.println(String.format("Maximum value of the arrayu is %d", max));
    }
}
