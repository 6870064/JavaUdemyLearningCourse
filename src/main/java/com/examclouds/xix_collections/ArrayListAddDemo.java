package com.examclouds.xix_collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        System.out.println("Начальный размер arrayList: " +arrayList.size());

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add("F");
        arrayList.add(1, "A2");
        arrayList.add(0, "C2");

        System.out.println("Размер после добавления: " +arrayList.size());
        System.out.println("Содержимое arrayList: " +arrayList);
        System.out.println(arrayList.get(0));

        arrayList.remove("F");
        arrayList.remove(2);

        System.out.println("Размер arrayList после удаления:" +arrayList.size());
        System.out.println("Содержимое of arrayList: " +arrayList);

        List<String> removeElements = List.of("C2", "A2", "AA", "F");
        System.out.println("Содержимое arrayList до removeAll: " +arrayList);

        arrayList.removeAll(removeElements);
        System.out.println("Содержимое arrayList после removeAll: " +arrayList);
    }
}
