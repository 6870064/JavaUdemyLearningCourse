package com.examclouds.xix_collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Бета");
        set.add("Альфа");
        set.add("Эта");
        set.add("Гамма");
        set.add("Эпсилон");
        set.add("Омега");

        System.out.println(set);
    }
}
