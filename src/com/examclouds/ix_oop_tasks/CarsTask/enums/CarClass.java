package com.examclouds.ix_oop_tasks.CarsTask.enums;

public enum CarClass {
    MINI("A"), SMALL("B"), MIDSIZE("C"), FULLSIZE("D"),
    BUSINESS("E"), EXECUTIVE("F"), SPORTS("S");

    private final String abbreviation;

    CarClass(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
