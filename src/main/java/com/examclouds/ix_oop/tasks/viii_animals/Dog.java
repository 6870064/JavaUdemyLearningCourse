package com.examclouds.ix_oop.tasks.viii_animals;

public class Dog extends Animal {
    private int dogAge;

    public Dog(String food, Location location, int dogAge) {
        super(food, location);
        this.dogAge = dogAge;
    }

    public static void makeNoise() {
        System.out.println("Dog is making noise");
    }

    public static void eat() {
        System.out.println("Dog is eating");
    }

    public static void sleep() {
        System.out.println("Dog is sleeping");
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }
}
