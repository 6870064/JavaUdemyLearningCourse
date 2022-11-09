package com.javcode.StackQueue;

public class Passenger {
    private static int number;
    private String name;
    private String surname;

    public Passenger(String name, String surname) {
        number++;
        this.name = name;
        this.surname = surname;
    }


    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Passenger.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Passenger " + name + " " + surname;
    }
}
