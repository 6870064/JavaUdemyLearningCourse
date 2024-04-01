package com.examclouds_2024.xix_collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PersonComparingDemo {
    public static void main(String[] args) {
        Comparator<Person> personComparator = Comparator.comparing(Person::getLastName).thenComparing(Person::getAge);
        SortedSet<Person> set = new TreeSet<>(personComparator);
        set.add(new Person("Alex", "Ivanov", 36));
        set.add(new Person("Masha", "Petrova", 23));
        set.add(new Person("Dasha", "Sidorova", 34));
        set.add(new Person("Vasya", "Ivanov", 25));
        set.forEach(System.out::println);
    }
}
