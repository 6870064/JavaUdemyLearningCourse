package com.examclouds.ix_oop.training.BoxBox;

public class BoxBox {
    double width;
    double height;
    double depth;

    public BoxBox(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public BoxBox() {
    }

    double getVolume() {
        return width * height * depth;
    }
}
