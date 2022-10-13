package com.examclouds.ix_oop.tasks.viii_animals;

public class Animal {
    private String food;
    private Location location;

    public Animal(String food, Location location) {
        this.food = food;
        this.location = location;
    }

    public static void makeNoise() {
        System.out.println("Animal is making noise");
    }

    public static void eat() {
        System.out.println("Animal is eating");
    }

    public static void sleep() {
        System.out.println("Animal is sleeping");
    }

    public static void printAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println();
    }

    public static void VetAppointment(Animal[] animals) {
        for (Animal animal : animals) {
            Veterinarian.treatAnimal(animal);
        }
        System.out.println();
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
                "food='" + food + '\'' +
                ", location=" + location +
                '}';
    }
}
