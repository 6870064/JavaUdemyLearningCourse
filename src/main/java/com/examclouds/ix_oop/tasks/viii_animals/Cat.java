package com.examclouds.ix_oop.tasks.viii_animals;

public class Cat extends Animal {
    private String catName;

    public Cat(String food, Location location, String catName) {
        super(food, location);
        this.catName = catName;
    }

    public static void makeNoise() {
        System.out.println("Cat is making noise");
    }

    public static void eat() {
        System.out.println("Cat is eating");
    }

    public static void sleep() {
        System.out.println("Cat is sleeping");
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
