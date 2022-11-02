package com.examclouds.xii_interfaces_and_enums.tasks.iv_clothes;

public class TShirt extends Clothes implements MensClothes, WomenClothes {
    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void DressUpMan() {

    }

    @Override
    public void DressUpWoman() {

    }

    @Override
    public String toString() {
        return "TShirt{" +
                "size=" + getSize() +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
