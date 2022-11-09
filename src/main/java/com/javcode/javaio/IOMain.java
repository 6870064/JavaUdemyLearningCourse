package com.javcode.javaio;

import java.io.*;
import java.util.*;

public class IOMain {

    private static final String FILE_MAME = "GradeBook.txt";
    private static final String BINARY_FILE_NAME = "Students.bin";

    public static void main(String[] args) throws IOException {
        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        Reader reader = new Reader();
        Writer writer = new Writer();
//        reader.readFile(FILE_MAME);
//        writer.readFile(grades, FILE_MAME);
       // writer.writeWithFormatter();
        //processGrades(grades, writer, BINARY_FILE_NAME);

       FileUtils utils = new FileUtils();
       utils.printIOFileDetails("./");
    }

    private static void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer, String fileName){
        List<Student> students = new ArrayList<>();
        for (AverageStudentGrade gradeKey: grades.keySet()){
            students.add(new Student(gradeKey.getName(), gradeKey.getAverageGrade(), grades.get(gradeKey)));
        }
        writer.writeObject(students, fileName);
    }

    private static void outputObjects(Reader reader, String fileName) {
     List<Student> students = reader.readObject(fileName);
     for (Student student : students) {
         System.out.printf("%s, %.2f, %n", student.getStudentName(), student.getAverageGrade());
         System.out.println(student.getGrades());
     }
    }
}
