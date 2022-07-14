package com.examclouds.OOPTasks.CarsTask.vehicles;

import com.examclouds.OOPTasks.CarsTask.details.Engine;
import com.examclouds.OOPTasks.CarsTask.enums.CarClass;
import com.examclouds.OOPTasks.CarsTask.professions.Driver;

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
