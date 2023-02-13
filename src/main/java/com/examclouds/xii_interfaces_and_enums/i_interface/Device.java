package com.examclouds.xii_interfaces_and_enums.i_interface;

public abstract class Device implements Moveable {
    @Override
    public void moveRight() {
        System.out.println("Device is turning right");
    }
}
