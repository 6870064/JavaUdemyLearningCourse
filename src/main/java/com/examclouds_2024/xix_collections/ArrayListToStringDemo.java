package com.examclouds_2024.xix_collections;

import java.util.Arrays;
import java.util.List;

public class ArrayListToStringDemo {
    public static void main(String[] args) {
        List<String> arrayList = List.of("C", "A", "E", "B", "D", "F");
       Object[] objectArray = arrayList.toArray();
        System.out.println(Arrays.toString(objectArray));


        List<String> arrayNewList = List.of("1", "2", "3", "4", "5");
        Object[] objectNewArray = arrayNewList.toArray();
        System.out.println(Arrays.toString(objectNewArray));

        List<String> arrayList2 = List.of("24", "32", "44", "32", "89", "42", "90");
        Object[] objectList2 = arrayList2.toArray();
        System.out.println(Arrays.toString(objectArray));
    }
}
