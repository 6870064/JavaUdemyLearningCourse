package com.examclouds.ix_oop_tasks.CarsTask.vehicles;

import com.examclouds.ix_oop_tasks.CarsTask.details.Engine;
import com.examclouds.ix_oop_tasks.CarsTask.enums.CarClass;
import com.examclouds.ix_oop_tasks.CarsTask.professions.Driver;

public class Lorry extends Car {
    int loadCapacity;

    public Lorry(String carBrand, CarClass carClass, Driver driver, Engine engine, int loadCapacity) {
        super(carBrand, carClass, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
