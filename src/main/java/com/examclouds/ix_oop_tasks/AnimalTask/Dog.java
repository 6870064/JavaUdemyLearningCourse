package com.examclouds.ix_oop_tasks.AnimalTask;

import com.examclouds.ix_oop_tasks.AnimalTask.enums.Location;

public class Dog extends Animal {
    String breed;

    public Dog(String animalName, String food, Location location, String breed) {
        super(animalName, food, location);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println(getAnimalName() + " with the breed" + getBreed() + "is sleeping");
    }
}
