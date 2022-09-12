package com.examclouds.ix_oop_tasks.CarsTask.vehicles;

import com.examclouds.ix_oop_tasks.CarsTask.details.Engine;
import com.examclouds.ix_oop_tasks.CarsTask.enums.CarClass;
import com.examclouds.ix_oop_tasks.CarsTask.professions.Driver;

public class SportCar extends Car {
    int maxSpeed;

    public SportCar(String carBrand, CarClass carClass, Driver driver, Engine engine) {
        super(carBrand, carClass, driver, engine);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
