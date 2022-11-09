package com.examclouds.xii_interfaces_and_enums.training.extend_interface;

public interface Football extends Sport, TVProgram {
    void homeTeamScored(int points);

    void visitingTeamScored(int points);

    void endOfQuarter(int quarter);
}
