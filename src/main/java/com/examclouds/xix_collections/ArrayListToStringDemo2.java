package com.examclouds.xix_collections;

import java.util.Arrays;
import java.util.List;

public class ArrayListToStringDemo2 {
    public static void main(String[] args) {
        List<String> arrayList = List.of("C", "A", "E", "B", "D", "F");

        //1-ый вариант
        String[] stringArray1 = new String[arrayList.size()];
        arrayList.toArray(stringArray1);
        System.out.println(Arrays.toString(stringArray1));

        //2-й вариант
        String[] stringArray2 = arrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray2));
    }
}
