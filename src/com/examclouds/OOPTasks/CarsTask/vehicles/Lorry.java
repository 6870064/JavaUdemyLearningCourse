package com.examclouds.OOPTasks.CarsTask.vehicles;

import com.examclouds.OOPTasks.CarsTask.details.Engine;
import com.examclouds.OOPTasks.CarsTask.enums.CarClass;
import com.examclouds.OOPTasks.CarsTask.professions.Driver;

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
