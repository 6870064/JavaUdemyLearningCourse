package com.examclouds.ix_oop.tasks.iv_inheritance_student_aspirant;

public class Aspirant extends Student{
    private String study;

    public Aspirant(String firstName, String lastName, Group group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public Aspirant() {
    }

    public static int getScholarship(double averageMark){
        int scholarship = averageMark == 5 ? 200 : 180;
        return scholarship;
    }

    @Override
    public String toString() {
        return "Aspirant{}";
    }
}
