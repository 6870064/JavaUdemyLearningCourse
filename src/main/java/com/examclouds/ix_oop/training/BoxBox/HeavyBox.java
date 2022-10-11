package com.examclouds.ix_oop.training.BoxBox;

public class HeavyBox extends BoxBox {
    int weight;

    public HeavyBox(){
    }

    public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}
