package com.examclouds.vi_arrays.training;

import java.util.Arrays;

public class ArraysDeepToStringDemo {
    public static void main(String[] args) {
        String[][] myArray = {{"один-один", "один-два", "один-три"},
                {"два-один", "два-два", "два-три"}};
        System.out.println(Arrays.deepToString(myArray));
    }
}
