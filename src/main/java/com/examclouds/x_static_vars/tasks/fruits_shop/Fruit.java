package com.examclouds.x_static_vars.tasks.fruits_shop;

public abstract class Fruit {
    private int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    abstract double fruitPrice(int weight);

    abstract double commonFruitPrice(Fruit[] fruits);

    public void printManufacturerInfo(){System.out.print("Made in Ukraine");}
}
