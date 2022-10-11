package com.examclouds.ix_oop.training.BoxBox;

public class DifferentBoxDemo {
    public static void main(String[] args) {
        BoxBox myBox = new BoxBox(15,12,14);
        HeavyBox heavyBox = new HeavyBox(15,10,20,5);
        ColorBox colorBox = new ColorBox(25, 12, 20, "red");

        System.out.println(String.format("Обьем коробки = %,.2f.0", myBox.getVolume()));
        System.out.println(String.format("Объем коробки = %,.2f.0",heavyBox.getVolume()));
        System.out.println(String.format("Обьем коробки = %,.2f.0", colorBox.getVolume()));
    }
}
