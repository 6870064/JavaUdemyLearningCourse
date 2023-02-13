package com.examclouds.xii_interfaces_and_enums.i_interface;

public class Robot implements Moveable {

    @Override
    public void moveRight() {
        System.out.println("Robot is moving right");
    }

    @Override
    public void moveLeft() {
        System.out.println("Robot is moving left");
    }
}
