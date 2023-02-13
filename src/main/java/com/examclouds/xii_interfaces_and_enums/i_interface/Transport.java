package com.examclouds.xii_interfaces_and_enums.i_interface;

public class Transport implements Moveable {
    @Override
    public void moveRight() {
        System.out.println("Transport is turning right");
    }

    @Override
    public void moveLeft() {
        System.out.println("Transport is turning left");
    }

    public void stop() {
        System.out.println("Transport is stopping");
    }

    public void start() {
        System.out.println("Transport is starting");
    }
}
