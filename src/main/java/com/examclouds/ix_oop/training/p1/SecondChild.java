package com.examclouds.ix_oop.training.p1;

public class SecondChild {

    Child child = new Child();
    public void someMethod(){
        child.protectedChildAccessMethod();
        child.publicChildMethod();
        child.defaultChildMethod();
    }
}
