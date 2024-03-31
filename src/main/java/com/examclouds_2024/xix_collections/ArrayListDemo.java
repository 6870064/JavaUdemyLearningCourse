package com.examclouds_2024.xix_collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        List<String> arrayNewList = new ArrayList<>();
        arrayNewList.add("R1");
        arrayNewList.add("Y1");
        arrayNewList.add("W1");
        arrayList.add("Q1");
        arrayNewList.add("M1");
        arrayNewList.add("N1");

        System.out.println("Начальный размер arrayList: " +arrayList.size());

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add("F");
        arrayList.add(1, "A2");
        arrayList.add(0,"C2");

        arrayList.add("W");
        arrayList.add(10,"P");

        arrayList.set(10, "P2");
        arrayList.addAll(11, arrayNewList);

        System.out.println("Размер arrayList после добавления: " +arrayList.size());
        System.out.println("Содержимое arrayList: " +arrayList);
        System.out.println(arrayList.get(0));

        arrayNewList.remove("W1");
        arrayNewList.remove(0);
        System.out.println(arrayNewList);
        arrayList.removeAll(arrayNewList);
        arrayNewList.clear();

        System.out.println(arrayNewList);
    }
}
