package com.examclouds.xix_collections.tasks;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<HeavyBox> set = new TreeSet<>();

        HeavyBox heavyBox = new HeavyBox(3);
        HeavyBox heavyBox1 = new HeavyBox(4);
        HeavyBox heavyBox2 = new HeavyBox(5);
        HeavyBox heavyBox3 = new HeavyBox(6);
        HeavyBox heavyBox4 = new HeavyBox(7);
        HeavyBox heavyBox5 = new HeavyBox(8);
        HeavyBox heavyBox6 = new HeavyBox(9);

        set.add(heavyBox);
        set.add(heavyBox1);
        set.add(heavyBox2);
        set.add(heavyBox3);
        set.add(heavyBox4);
        set.add(heavyBox5);
        set.add(heavyBox6);

        set.forEach(System.out::println);

    }
}
