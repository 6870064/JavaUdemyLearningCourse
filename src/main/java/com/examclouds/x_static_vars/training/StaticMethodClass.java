package com.examclouds.x_static_vars.training;

public class StaticMethodClass {
    static int staticVar = 3;
    int nonStaticVar;

    static void staticMethod(int localVar) {
        System.out.println("localVar = " + localVar);
        System.out.println("staticVar = " + staticVar);
    }

    public static void main(String[] args) {
        staticMethod(42);
        StaticMethodClass useStatic = new StaticMethodClass();
        useStatic.nonStaticMethod();
        staticMethod(67);
    }

    public void nonStaticMethod() {
        System.out.println("Non-static method");
    }
}
