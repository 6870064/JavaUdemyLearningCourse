package com.examclouds.ix_oop;

public class Box6 {
    double width;
    double height;
    double depth;

    Box6(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box6(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box6(double len){
        width = len;
        height = len;
        depth = len;
    }

    double getVolume(){
        return width * height * depth;
    }
}
