package com.examclouds.ix_oop;

public class TestDemo {
    static void changeObject(Box5 box){
        box.width *= 2;
        box.height /= 2;
        box.depth += 2;
    }

    static void changePrimitives(int a, int b){
        a *= 2;
        b/=2;
    }
}
