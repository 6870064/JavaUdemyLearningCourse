package com.examclouds.ix_oop.tasks.i_phone_class;

public class Phone {
    Manufacturer manufacturer;
    public String number;
    public String model;
    public int weight;

    public Phone(Manufacturer manufacturer, String number, String model, int weight) {
        this(manufacturer,number,model);
        this.weight = weight;
    }

    public Phone(Manufacturer manufacturer, String number, String model) {
        this.manufacturer = manufacturer;
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public static void receiveCall(String callerName){
        System.out.println(String.format("%s is calling", callerName));
    }

    public static void receiveCall(String callerName, String phoneNumber){
        System.out.println(String.format("%s is calling from the number %s", callerName, phoneNumber));
    }

    public static void sendMessage(String...args){
        for (String number : args){
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer=" + manufacturer +
                ", number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
