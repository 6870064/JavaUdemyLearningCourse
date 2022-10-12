package com.examclouds.ix_oop.tasks.vi_cars.vehicles;

import com.examclouds.ix_oop.tasks.vi_cars.details.Engine;
import com.examclouds.ix_oop.tasks.vi_cars.professions.Driver;

public class Lorry extends Car {
    private final int loadCapacity;

    public Lorry(String carBrand, CarClass carClass, int carWeight, Driver driver, Engine engine, int loadCapacity) {
        super(carBrand, carClass, carWeight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
