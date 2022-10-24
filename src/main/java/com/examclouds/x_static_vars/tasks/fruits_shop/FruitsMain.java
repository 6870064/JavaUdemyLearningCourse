package com.examclouds.x_static_vars.tasks.fruits_shop;

public class FruitsMain {
    public static void main(String[] args) {
        Apple apple = new Apple(100);
        Apple apple1 = new Apple(200);
        Apple apple2 = new Apple(200);
        Apple apple3 = new Apple(220);

        Apricot apricot = new Apricot(100);
        Apricot apricot1 = new Apricot(300);
        Apricot apricot2 = new Apricot(100);

        Pear pear = new Pear(200);
        Pear pear1 = new Pear(220);
        Pear pear2 = new Pear(190);

        Fruit[] allFruits = {apple, apple1, apple2, apple3, apricot, apricot1, apricot2, pear, pear1, pear2};
        Fruit[] allApples = {apple, apple1, apple2, apple3};
        Fruit[] allApricots = {apricot, apricot1, apricot2};
        Fruit[] allPears = {pear, pear1, pear2};

        apricot.commonFruitPrice(allFruits);
        apricot.commonFruitPrice(allApples);
        apricot.commonFruitPrice(allApricots);
        apricot.commonFruitPrice(allPears);
    }
}
