package com.examclouds.ix_oop.tasks.vi_cars.professions;

import com.github.javafaker.Faker;

public class Driver {

    private String fullName;
    private int drivingExperience;

    public Driver(String fullName, int drivingExperience) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }

    public static Driver createDriver() {
        Faker faker = new Faker();

        Driver driver = new Driver(
                faker.name().fullName(),
                (int) (Math.random() * 10));

        return driver;
    }

    public static void printDrivers(Driver[] drivers){
        System.out.println("List of drivers:");
        for (Driver driver : drivers){
            System.out.println(driver);
        }
        System.out.println();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", drivingExperience = " + drivingExperience + " years"+
                '}';
    }
}
