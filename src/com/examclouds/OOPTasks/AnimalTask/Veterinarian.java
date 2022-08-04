package com.examclouds.OOPTasks.AnimalTask;

import com.examclouds.OOPTasks.AnimalTask.enums.Location;

public class Veterinarian {
    String fullName;
    Location location;

    public Veterinarian(String fullName, Location location) {
        this.fullName = fullName;
        this.location = location;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "fullName='" + fullName + '\'' +
                ", location=" + location +
                '}';
    }

    public void treatAnimal(Animal animal){
        System.out.println(String.format("location of the animal: %s", animal.getLocation()));
        System.out.println(String.format("%s is eating %s", animal.getAnimalName(), animal.getFood()));
    }
}
