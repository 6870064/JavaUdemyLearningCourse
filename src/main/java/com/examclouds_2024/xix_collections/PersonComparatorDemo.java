package com.examclouds_2024.xix_collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class PersonComparatorDemo {
    public static void main(String[] args) {
        PersonComparator personComparator = new PersonComparator();
        SortedSet<Person> set = new TreeSet<>(personComparator);
        set.add(new Person("Alex", "Ivanov", 36));
        set.add(new Person("Masha", "Petrova", 23));
        set.add(new Person("Dasha", "Sidorova", 34));
        set.add(new Person("Vasya", "Ivanov", 25));

        set.forEach(System.out::println);
    }
}
