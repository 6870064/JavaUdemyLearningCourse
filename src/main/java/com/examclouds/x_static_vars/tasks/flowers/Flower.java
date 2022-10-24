package com.examclouds.x_static_vars.tasks.flowers;

public class Flower {
    static int count;
    private Country country;
    private int shelfLife;
    private int price;

    public Flower(Country country, int shelfLife, int price) {
        count++;
        this.country = country;
        this.shelfLife = shelfLife;
        this.price = price;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int priceOfBouquet(Flower[] flowers){
        int price = 0;
        for (Flower flower : flowers){
            price = price + flower.getPrice();
        }
        System.out.println(String.format("Price of bouquet is %s", price));
        return price;
    }
}
