package com.examclouds.xii_interfaces_and_enums.tasks.ii_interface_instrument;

public class Trumpet implements Instrument {
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println(String.format("Trumpet with diameter %s is playing", getDiameter()));
    }
}
