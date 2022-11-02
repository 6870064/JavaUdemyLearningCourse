package com.examclouds.xii_interfaces_and_enums.tasks.iv_clothes;

public class Tie extends Clothes implements MensClothes {
    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void DressUpMan() {
    }

    @Override
    public Size getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(Size size) {
        super.setSize(size);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + getSize() +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
