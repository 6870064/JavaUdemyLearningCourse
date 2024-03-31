package com.examclouds_2024.xix_collections;

import java.util.Arrays;
import java.util.List;

public class ArraysListToStringDemo {
    public static void main(String[] args) {
        List<String> arrayList = List.of("C", "A", "E", "B", "D", "F");
        //1 вариант
        String[] stringArray1 = new String[arrayList.size()];
        arrayList.toArray(stringArray1);
        System.out.println(Arrays.toString(stringArray1));

        //2-вариант
        String[] stringArray2 = arrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray2));
    }
}
