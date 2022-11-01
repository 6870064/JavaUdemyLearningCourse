package com.examclouds.xii_interfaces_and_enums.tasks.iii_seasons;

public enum Seasons {
    WINTER (5), SPRING (10), SUMMER (30) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN (12);
    private int averageTemp;

    Seasons(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public void setAverageTemp(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public String getDescription(){
        return "Холодное время года";
    }
}


