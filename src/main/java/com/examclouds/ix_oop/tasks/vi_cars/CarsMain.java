package com.examclouds.ix_oop.tasks.vi_cars;

import com.examclouds.ix_oop.tasks.vi_cars.professions.Driver;

public class CarsMain {
    public static void main(String[] args) {

        Driver driver = Driver.createDriver();
        Driver driver1 = Driver.createDriver();
        Driver driver2 = Driver.createDriver();
        Driver driver3 = Driver.createDriver();
        Driver driver4 = Driver.createDriver();
        Driver driver5 = Driver.createDriver();

        Driver[] driversArray = {driver, driver1, driver2, driver3, driver4, driver5};
        Driver.printDrivers(driversArray);
    }

}
