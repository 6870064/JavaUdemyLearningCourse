package com.examclouds.x_static_vars.tasks.fruits_shop;

public class Apricot extends Fruit {
    public Apricot(int weight) {
        super(weight);
    }

    @Override
    double fruitPrice(int weight) {
        return weight * 1.2;
    }

    @Override
    public double commonFruitPrice(Fruit[] fruits) {
        double price = 0;
        for (Fruit fruit : fruits){
            price += fruitPrice(fruit.getWeight());
        }
        System.out.println(String.format("Common fruit price is %s", price));
        return price;
    }


}
