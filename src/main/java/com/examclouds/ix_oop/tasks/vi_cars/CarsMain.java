package com.examclouds.ix_oop.tasks.vi_cars;

import com.examclouds.ix_oop.tasks.vi_cars.details.Engine;
import com.examclouds.ix_oop.tasks.vi_cars.details.Manufacturer;
import com.examclouds.ix_oop.tasks.vi_cars.professions.Driver;
import com.examclouds.ix_oop.tasks.vi_cars.vehicles.Car;
import com.examclouds.ix_oop.tasks.vi_cars.vehicles.CarClass;

public class CarsMain {
    public static void main(String[] args) {

        Driver driver = Driver.createDriver();
        Driver driver1 = Driver.createDriver();
        Driver driver2 = Driver.createDriver();
        Driver driver3 = Driver.createDriver();
        Driver driver4 = Driver.createDriver();
        Driver driver5 = Driver.createDriver();

        Engine opelEngine = new Engine(245, Manufacturer.OPEL);
        Engine audiEngine = new Engine(250, Manufacturer.AUDI);
        Engine bmwEngine = new Engine(320, Manufacturer.BMW);
        Engine kiaEngine = new Engine(150, Manufacturer.KIA);
        Engine opelEngine1 = new Engine(180, Manufacturer.OPEL);
        Engine teslaEngine = new Engine(345, Manufacturer.TESLA);
        Engine bmwEngine1 = new Engine(500, Manufacturer.BMW);

        Car audiCar = new Car("Audi A5", CarClass.A, 2140, driver, audiEngine);
        Car bmwCar = new Car("BMW X3", CarClass.A, 2540, driver1, bmwEngine);
        Car opelCar = new Car("Opel Antara", CarClass.A, 2240, driver2, opelEngine);
        Car kiaCar = new Car("KIA Sportage", CarClass.B, 2300, driver3, kiaEngine);
        Car opelCar1 = new Car("Opel Astra K", CarClass.C, 1950, driver4, opelEngine1);
        Car teslaCar = new Car("Tesla Model X", CarClass.A, 2340, driver5, teslaEngine);
        Car bmwLorryCar = new Car("BMW Lorry", CarClass.PICKUPS, 4500, driver1, bmwEngine1);

        Driver[] driversArray = {driver, driver1, driver2, driver3, driver4, driver5};
        Driver.printDrivers(driversArray);

        Engine[] enginesArray = {opelEngine, audiEngine, bmwEngine, kiaEngine, opelEngine1, teslaEngine, bmwEngine1};
        Engine.printEngine(enginesArray);
        Car[] carsArray = {audiCar, bmwCar, opelCar, kiaCar, opelCar1, teslaCar, bmwLorryCar};
        Car.printCars(carsArray);
    }

}
