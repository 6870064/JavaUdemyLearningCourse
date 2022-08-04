package com.examclouds.OOPTasks.CarsTask;

import com.examclouds.OOPTasks.CarsTask.details.Engine;
import com.examclouds.OOPTasks.CarsTask.enums.CarClass;
import com.examclouds.OOPTasks.CarsTask.enums.Manufacturer;
import com.examclouds.OOPTasks.CarsTask.professions.Driver;
import com.examclouds.OOPTasks.CarsTask.vehicles.Car;

public class CarsTaskMain {
    public static void main(String[] args) {
        Driver driver = new Driver("Michael David", 5);
        Driver driver1 = new Driver("Sergey Ivanov", 4);
        Driver driver2 = new Driver("Alex Douglas", 6);

        Engine engine = new Engine(230, Manufacturer.BMW);
        Engine engine1 = new Engine(190, Manufacturer.AUDI);
        Engine engine2 = new Engine(250, Manufacturer.VOLKSWAGEN);

        Car car = new Car("BMW", CarClass.BUSINESS, driver, engine);
        Car car1 = new Car("AUDI", CarClass.EXECUTIVE, driver1, engine1);
        Car car2 = new Car("VOLKSWAGEN", CarClass.BUSINESS, driver2, engine2);

        Car[] cars = {car, car1, car2};
        Driver[] drivers = {driver, driver1, driver2};
        Engine[] engines = {engine, engine1, engine2};

        Car.printArray(cars);
        Driver.printArray(drivers);
        Engine.printArray(engines);
    }
}
