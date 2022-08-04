package com.examclouds.OOPTasks.AnimalTask;

import com.examclouds.OOPTasks.AnimalTask.enums.Location;

public class Animal {
    String animalName;
    String food;
    Location location;

    public Animal(String animalName, String food, Location location) {
        this.animalName = animalName;
        this.food = food;
        this.location = location;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", food='" + food + '\'' +
                ", location=" + location +
                '}';
    }

    public void makeNoise() {
        System.out.println(String.format("%s is barking", getAnimalName()));
    }

    public void eat() {
        System.out.println(String.format("%s is eating %s", getAnimalName(), getFood()));
    }

    public void sleep() {
        System.out.println(String.format("%s is sleeping", getAnimalName()));
    }
}
