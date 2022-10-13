package com.examclouds.ix_oop.training.p1.p2;

import com.examclouds.ix_oop.training.p1.Child;
import com.examclouds.ix_oop.training.p1.Parent;

public class ThirdChild extends Parent {
    Child child = new Child();

    public void someMethod(){
        publicParentAccessMethod();
        protectedParentAccessMethod();
        child.publicChildMethod();
    }
}
