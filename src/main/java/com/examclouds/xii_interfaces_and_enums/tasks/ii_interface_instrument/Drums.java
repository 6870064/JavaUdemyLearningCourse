package com.examclouds.xii_interfaces_and_enums.tasks.ii_interface_instrument;

import java.util.Objects;

public class Drums implements Instrument {
    private int size;

    public Drums(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drums drums = (Drums) o;
        return size == drums.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public void play() {
        System.out.println(String.format("Drums with the size %s is playing", getSize()));
    }
}
