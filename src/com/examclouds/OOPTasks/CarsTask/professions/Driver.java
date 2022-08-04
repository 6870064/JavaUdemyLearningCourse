package com.examclouds.OOPTasks.CarsTask.professions;

public class Driver extends Person {
    int drivingExperience;

    public Driver(String fullName, int drivingExperience) {
        super(fullName);
        this.drivingExperience = drivingExperience;
    }

    public static void printArray(Driver[] drivers) {
        for (int i = 0; i < drivers.length; i++) {
            System.out.println(drivers[i]);
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
