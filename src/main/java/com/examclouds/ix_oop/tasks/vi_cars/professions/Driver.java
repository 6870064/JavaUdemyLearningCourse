package com.examclouds.ix_oop.tasks.vi_cars.professions;

import com.github.javafaker.Faker;

public class Driver extends Person {

    private int drivingExperience;

    public Driver(String fullName, int age, int drivingExperience) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }


    public static Driver createDriver() {
        Faker faker = new Faker();

        Driver driver = new Driver(
                faker.name().fullName(),
                (int) (Math.random() * 70),
                (int) (Math.random() * 10));
        return driver;
    }

    /**
     * Метод, выводящий на печать массив водителей
     *
     * @param drivers
     */
    public static void printDrivers(Driver[] drivers) {
        System.out.println("List of drivers:");
        for (Driver driver : drivers) {
            System.out.println(driver);
        }
        System.out.println();
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
                "fullName = " + getFullName() +
                ", age = " + getAge() +
                ", drivingExperience = " + drivingExperience +
                '}';
    }
}
