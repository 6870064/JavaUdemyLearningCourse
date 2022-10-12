package com.examclouds.ix_oop.tasks.vi_cars.vehicles;

import com.examclouds.ix_oop.tasks.vi_cars.details.Engine;
import com.examclouds.ix_oop.tasks.vi_cars.professions.Driver;

public class Car {
    private String CarBrand;
    private final CarClass carClass;
    private int carWeight;
    private final Driver driver;
    private final Engine engine;

    public Car(String carBrand, CarClass carClass, int carWeight, Driver driver, Engine engine) {
        CarBrand = carBrand;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.driver = driver;
        this.engine = engine;
    }

    public static void printCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
    }

    public String getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    private void start() {
        System.out.println(String.format("%s is started", getCarBrand()));
    }

    private void stop() {
        System.out.println(String.format("%s is stopped", getCarBrand()));
    }

    private void turnRight() {
        System.out.println(String.format("%s is turning right", getCarBrand()));
    }

    private void turnLeft() {
        System.out.println(String.format("%s is is turning left", getCarBrand()));
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarBrand='" + CarBrand + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
