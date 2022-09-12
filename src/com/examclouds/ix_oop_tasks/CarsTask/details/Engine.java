package com.examclouds.ix_oop_tasks.CarsTask.details;

import com.examclouds.ix_oop_tasks.CarsTask.enums.Manufacturer;

public class Engine {
    int enginePower;
    Manufacturer engineManufacturer;

    public Engine(int enginePower, Manufacturer engineManufacturer) {
        this.enginePower = enginePower;
        this.engineManufacturer = engineManufacturer;
    }

    public static void printArray(Engine[] engines) {
        for (int i = 0; i < engines.length; i++) {
            System.out.println(engines[i]);
        }
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public Manufacturer getEngineManufacturer() {
        return engineManufacturer;
    }

    public void setEngineManufacturer(Manufacturer engineManufacturer) {
        this.engineManufacturer = engineManufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower=" + enginePower +
                '}';
    }
}
