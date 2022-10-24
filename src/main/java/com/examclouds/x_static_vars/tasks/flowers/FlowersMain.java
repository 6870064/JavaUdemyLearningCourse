package com.examclouds.x_static_vars.tasks.flowers;

public class FlowersMain {
    public static void main(String[] args) {
        Flower rose = new Rose(Country.FRANCE, 5, 12);
        Flower rose1 = new Rose(Country.FRANCE, 5, 14);
        Flower rose2 = new Rose(Country.FRANCE, 5, 12);
        Flower rose3 = new Rose(Country.FRANCE, 5, 10);
        Flower rose4 = new Rose(Country.FRANCE, 5, 11);

        Flower tulip = new Tulip(Country.NETHERLANDS, 5, 10);
        Flower tulip1 = new Tulip(Country.NETHERLANDS, 5, 10);
        Flower tulip2 = new Tulip(Country.NETHERLANDS, 5, 11);

        Flower pion = new Pion(Country.NETHERLANDS, 5, 20);
        Flower pion1 = new Pion(Country.NETHERLANDS, 5, 20);
        Flower pion2 = new Pion(Country.NETHERLANDS, 5, 20);

        Flower carnation = new Carnation(Country.NETHERLANDS, 5, 5);
        Flower carnation1 = new Carnation(Country.NETHERLANDS, 5, 6);
        Flower carnation2 = new Carnation(Country.NETHERLANDS, 5, 7);

        System.out.println("Amount of flowers sold " +Flower.count);

        Flower[] bouquet = {rose, tulip, pion, carnation, rose1, rose2};
        Flower[] bouquet1 = {rose3, tulip1, pion1, carnation1};
        Flower[] bouquet2 = {rose4, tulip2, pion2, carnation2};

        Flower.priceOfBouquet(bouquet);
        Flower.priceOfBouquet(bouquet1);
        Flower.priceOfBouquet(bouquet2);
    }
}
