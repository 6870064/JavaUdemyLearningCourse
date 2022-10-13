package com.examclouds.ix_oop.training.p1;

public class Child extends Parent {
    public void someMethod(){
        publicParentAccessMethod();
        protectedParentAccessMethod();

    }

    void defaultChildMethod(){
    }

    public void publicChildMethod(){
    }

    protected void protectedChildAccessMethod() {
    }

    private void privateChildMethod(){
    }
}
