package com.examclouds.OOPTasks.AnimalTask;

import com.examclouds.OOPTasks.AnimalTask.enums.Location;

public class Cat extends Animal {

    int catAge;

    public Cat(String animalName, String food, Location location, int catAge) {
        super(animalName, food, location);
        this.catAge = catAge;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    @Override
    public void makeNoise() {
        System.out.println(String.format("%s is barking", getAnimalName()));
        System.out.println(getAnimalName() + " age is " + getCatAge());
    }
}
