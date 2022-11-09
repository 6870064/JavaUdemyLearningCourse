package com.examclouds.xii_interfaces_and_enums.training.interfaces;

public class Transport implements Moveable {

    @Override
    public void moveRight() {
        System.out.println("Transport in turning right");
    }

    @Override
    public void moveLeft() {
        System.out.println("Transport in turning left");
    }

    public void start() {
        System.out.println("Transport is starting moving");
    }

    public void stop() {
        System.out.println("Transport is stopping");
    }
}
