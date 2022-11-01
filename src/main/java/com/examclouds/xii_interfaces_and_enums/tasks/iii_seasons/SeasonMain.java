package com.examclouds.xii_interfaces_and_enums.tasks.iii_seasons;

public class SeasonMain {
    public static void main(String[] args) {

        Seasons seasons = Seasons.SUMMER;
        System.out.println(seasons);
        favoriteSeason(Seasons.WINTER);
        printAllValues();
    }

    public static void favoriteSeason(Seasons season) {
        switch (season) {
            case AUTUMN:
                System.out.println("I like autumn");
                break;
            case SPRING:
                System.out.println("I like spring");
                break;
            case SUMMER:
                System.out.println("I like summer");
                break;
            case WINTER:
                System.out.println("I like winter");
                break;
            default:
                break;
        }
    }

    public static void printAllValues() {
        for (Seasons s : Seasons.values()) {
            System.out.println(s+ " " +s.getAverageTemp() + " " +s.getDescription());
        }
    }
}
