package com.examclouds.ix_oop.tasks.vi_cars.details;

public class Engine {
    public Manufacturer manufacturer;
    private int capacity;


    public Engine(int capacity, Manufacturer manufacturer) {
        this.capacity = capacity;
        this.manufacturer = manufacturer;
    }

    public static void printEngine(Engine[] engines) {
        for (Engine engine : engines) {
            System.out.println(engine);
        }
        System.out.println();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
