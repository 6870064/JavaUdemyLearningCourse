package com.examclouds.xii_interfaces_and_enums.training.interfaces;

public class Robot implements Moveable {

        @Override
        public void moveRight() {
                System.out.println("Robot is turning right");
        }

        @Override
        public void moveLeft() {
                System.out.println("Robot is turning left");
        }
}
