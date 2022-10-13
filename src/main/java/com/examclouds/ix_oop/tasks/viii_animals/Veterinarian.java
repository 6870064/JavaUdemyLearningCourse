package com.examclouds.ix_oop.tasks.viii_animals;

public class Veterinarian {

    public static void treatAnimal(Animal animal) {
        System.out.println(String.format("Animal from location %s is eating %s", animal.getLocation(), animal.getFood()));
    }
}
