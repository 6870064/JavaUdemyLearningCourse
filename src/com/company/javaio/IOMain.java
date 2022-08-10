package com.company.javaio;

import java.io.*;
import java.util.*;

public class IOMain {

    private static final String FILE_MAME = "GradeBook.txt";
    public static void main(String[] args) throws IOException {
        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        Reader reader = new Reader();
        Writer writer = new Writer();
        reader.readFile(FILE_MAME);
        writer.readFile(grades, FILE_MAME);
       // writer.writeWithFormatter();
    }

    private void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer, String fileName){
        List<Student> students = new ArrayList<>();
        for (AverageStudentGrade gradeKey: grades.keySet()){
            students.add(new Student(gradeKey.getName(), gradeKey.getAverageGrade(), grades.get(gradeKey)));
        }
        writer.

    }





}
