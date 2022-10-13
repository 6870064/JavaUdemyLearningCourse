package com.examclouds.ix_oop.tasks.viii_animals;

public class Horse extends Animal {
    private int weight;

    public Horse(String food, Location location, int weight) {
        super(food, location);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
