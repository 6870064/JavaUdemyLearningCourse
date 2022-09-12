package com.examclouds.ix_oop_tasks.LibraryReadersTask.enums;

public enum Faculty {
    ACCOUNTING_ECONOMY("A_E"), MANAGEMENT("M"), BANKING("B"),
    LAW("L"), BACHELORY("BC");

    private final String abbreviation;

    Faculty(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
