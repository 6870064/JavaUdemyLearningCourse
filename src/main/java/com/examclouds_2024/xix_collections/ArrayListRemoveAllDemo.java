package com.examclouds_2024.xix_collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveAllDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("K");
        arrayList.add("R");
        arrayList.add("E");
        arrayList.add("P");

        List<String> removeElements = List.of("C2", "A2", "AA", "F");
        System.out.println("Содержимое arrayList до removeAll: " +arrayList);

        arrayList.removeAll(removeElements);
        System.out.println("Содержимое arrayList после removeAll: " +arrayList);

    }




}
