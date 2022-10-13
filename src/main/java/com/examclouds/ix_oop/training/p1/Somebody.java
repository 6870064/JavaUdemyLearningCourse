package com.examclouds.ix_oop.training.p1;

public class Somebody {
    Parent parent = new Parent();
    public void someMethod(){
        parent.publicParentAccessMethod();
        parent.defaultParentAccessMethod();
        parent.protectedParentAccessMethod();
    }
}
