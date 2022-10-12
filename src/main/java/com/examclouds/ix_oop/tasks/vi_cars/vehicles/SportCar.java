package com.examclouds.ix_oop.tasks.vi_cars.vehicles;

import com.examclouds.ix_oop.tasks.vi_cars.details.Engine;
import com.examclouds.ix_oop.tasks.vi_cars.professions.Driver;

public class SportCar extends Car {
    private final int maxSpeed;

    public SportCar(String carBrand, CarClass carClass, int carWeight, Driver driver, Engine engine, int maxSpeed) {
        super(carBrand, carClass, carWeight, driver, engine);
        this.maxSpeed = maxSpeed;
    }
}
