package com.examclouds.xii_interfaces_and_enums.tasks.iv_clothes;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void DressUpWoman() {

    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size=" + getSize() +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
