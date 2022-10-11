package com.examclouds.ix_oop.tasks.iv_inheritance_student_aspirant;

public class InheritanceMain {
    public static void main(String[] args) {
        Student myStudent = new Aspirant();
        Student myStudent1 = new Student("Ivan", "Ivanov", Group.F11, 4.55);
        Student myStudent2 = new Student("Petr", "Petrov", Group.G02, 5.00);
        Aspirant aspirant = new Aspirant("Serg", "Sidorov", Group.G03, 5.00);

        System.out.println(myStudent1.getScholarship(myStudent1.getAverageMark()));
        Student[] studentArray = {myStudent, myStudent1, myStudent2, aspirant};
        Student.printStudents(studentArray);
    }

}
