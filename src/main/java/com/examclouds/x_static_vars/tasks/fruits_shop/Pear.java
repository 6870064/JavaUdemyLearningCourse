package com.examclouds.x_static_vars.tasks.fruits_shop;

public class Pear extends Fruit {

    public Pear(int weight) {
        super(weight);
    }

    @Override
    double fruitPrice(int weight) {
        return weight * 1.5;
    }

    @Override
    double commonFruitPrice(Fruit[] fruits) {
        return 0;
    }

}
