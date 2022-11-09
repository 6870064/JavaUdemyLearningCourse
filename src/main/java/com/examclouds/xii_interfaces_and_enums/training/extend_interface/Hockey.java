package com.examclouds.xii_interfaces_and_enums.training.extend_interface;

public interface Hockey extends Sport {
    void homeGoalScored();

    void visitingGoalScored();

    void endOfPeriod(int period);

    void overtimePeriod(int ot);
}
