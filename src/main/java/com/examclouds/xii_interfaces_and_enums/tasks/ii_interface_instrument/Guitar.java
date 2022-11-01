package com.examclouds.xii_interfaces_and_enums.tasks.ii_interface_instrument;

public class Guitar implements Instrument {
    private int stringsNumber;

    public Guitar(int stringsNumber) {
        this.stringsNumber = stringsNumber;
    }

    public int getStringsNumber() {
        return stringsNumber;
    }

    public void setStringsNumber(int stringsNumber) {
        this.stringsNumber = stringsNumber;
    }

    @Override
    public void play() {
        System.out.println(String.format("Guitar with %s strings is playing", getStringsNumber()));
    }
}
