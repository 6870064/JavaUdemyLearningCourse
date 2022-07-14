package com.examclouds.OOPTasks.AnimalTask;

import com.examclouds.OOPTasks.AnimalTask.enums.Location;

public class Horse extends Animal {
    int weight;

    public Horse(String animalName, String food, Location location, int weight) {
        super(animalName, food, location);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getAnimalName() + " weight is " + getWeight());
    }
}
