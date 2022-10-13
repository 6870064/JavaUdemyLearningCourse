package com.examclouds.ix_oop.training.p2;

import com.examclouds.ix_oop.training.p1.Child;
import com.examclouds.ix_oop.training.p1.Parent;

public class ThirdChild extends Parent {

    public void someMethod(){
        protectedParentAccessMethod();
        publicParentAccessMethod();

    }
}
