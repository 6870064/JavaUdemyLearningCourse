package com.examclouds.ii_create_and_run_java_app.cars_task.vehicles;

import com.examclouds.ii_create_and_run_java_app.cars_task.details.Engine;
import com.examclouds.ii_create_and_run_java_app.cars_task.professions.Driver;

public class Car {
    public static void main(String[] args) {

        Engine engine = new Engine();
        Driver driver = new Driver();
        System.out.println("I'm driving");
    }
}
