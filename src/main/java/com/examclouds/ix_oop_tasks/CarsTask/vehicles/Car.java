package com.examclouds.ix_oop_tasks.CarsTask.vehicles;

import com.examclouds.ix_oop_tasks.CarsTask.details.Engine;
import com.examclouds.ix_oop_tasks.CarsTask.enums.CarClass;
import com.examclouds.ix_oop_tasks.CarsTask.professions.Driver;

public class Car {
    String carBrand;
    CarClass carClass;
    int carWeight;
    Driver driver;
    Engine engine;

    public Car(String carBrand, CarClass carClass, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.driver = driver;
        this.engine = engine;
    }

    public static void printArray(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
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

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass=" + carClass +
                ", carWeight=" + carWeight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public void start() {
        System.out.println(getCarBrand() + "has started");
    }

    public void stop() {
        System.out.println(getCarBrand() + "has stopped");
    }

    public void turnRight() {
        System.out.println(getCarBrand() + "is turned right");
    }

    public void turnLeft() {
        System.out.println(getCarBrand() + "is turned left");
    }
}
