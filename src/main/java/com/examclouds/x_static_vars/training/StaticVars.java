package com.examclouds.x_static_vars.training;

public class StaticVars {
    static int b;
    int a;

    public static void main(String[] args) {
        StaticVars staticVars = new StaticVars();
        System.out.println(staticVars.a);
        System.out.println(b);
    }
}
