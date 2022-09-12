package com.examclouds.ix_oop_tasks.CarsTask.enums;

public enum Manufacturer {
    BMW("B"), TESLA("T"), AUDI("A"), VOLKSWAGEN("VW"), GEELY("G");

    private final String abbreviation;

    Manufacturer(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviate() {
        return abbreviation;
    }
}
