package com.examclouds.x_static_vars.tasks.phone_class_task.enums;

public enum Vendor {
    APPLE("A"), SAMSUNG("S"), LG("LG"), HUAWEI("H"), GOOGLE("G");

    public final String abbreviation;


    Vendor(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
