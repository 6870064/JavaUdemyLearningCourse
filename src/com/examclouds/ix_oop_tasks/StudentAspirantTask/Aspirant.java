package com.examclouds.ix_oop_tasks.StudentAspirantTask;

public class Aspirant extends Student {
    public Aspirant(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

@Override
    public int getScholarship(double averageMark) {
        double scholarship = 0.0;
        if (averageMark == 5.0) {
            scholarship = 200;
        } else {
            scholarship = 180;
        }
        return (int) scholarship;
    }
}
