package com.examclouds.xii_interfaces_and_enums.i_interface;

public class Pickup implements CargoAuto, PassengersAuto {
    @Override
    public void transportCargo() {
        System.out.println("Везу груз");
    }

    @Override
    public void transportPassengers() {
        System.out.println("Везу пассажиров");
    }
}
