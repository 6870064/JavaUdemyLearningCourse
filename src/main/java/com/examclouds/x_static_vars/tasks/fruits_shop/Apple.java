package com.examclouds.x_static_vars.tasks.fruits_shop;

public class Apple extends Fruit {
    public Apple(int weight) {
        super(weight);
    }

    @Override
    double fruitPrice(int weight) {
        return weight * 1.4;
    }

    @Override
    double commonFruitPrice(Fruit[] fruits) {
        return 0;
    }

}
