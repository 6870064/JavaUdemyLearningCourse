package com.examclouds.xii_interfaces_and_enums.i_interface;

public class TransportDemo {
    public static void main(String[] args) {
        Moveable moveable = new Transport();
        Transport transport = new Transport();
        Moveable robot = new Robot();
    //    Moveable moveable1 = new Moveable();


        moveable.moveRight();
        moveable.moveLeft();
        System.out.println();

        transport.start();
        transport.moveRight();
        transport.moveLeft();
        transport.stop();
        System.out.println();

        robot.moveLeft();
        robot.moveRight();
    }
}
