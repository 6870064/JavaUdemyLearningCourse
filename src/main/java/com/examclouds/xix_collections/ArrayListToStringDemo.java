package com.examclouds.xix_collections;

import java.util.Arrays;
import java.util.List;

public class ArrayListToStringDemo {
    public static void main(String[] args) {
        List<String> arrayList = List.of("C", "A", "E", "B", "D", "F");
        Object[] objectArray = arrayList.toArray();
        System.out.println(Arrays.toString(objectArray));
    }
}
