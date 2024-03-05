package com.examclouds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetList {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(1);
        System.out.println(a);

        List <Integer> arr = new ArrayList<>(a);
        System.out.println(arr);
        System.out.println(arr.get(1));

        List <Integer> arrList = new ArrayList<>();
        arrList.add(11);
        arrList.add(11);
        arrList.add(12);
        arrList.add(13);
        arrList.add(14);
        arrList.add(15);
        arrList.add(15);

        Set<Integer> b = new HashSet<>(arrList);
        System.out.println(b);

    }
}
