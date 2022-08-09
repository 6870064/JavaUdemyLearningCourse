package com.company.javaio;

import java.io.*;
import java.util.*;

public class IOMain {

    private static final String FILE_MAME = "GradeBook.txt";
    public static void main(String[] args) throws IOException {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
//        readFile(grades);
//        readFile();

        Formatter formatter = new Formatter("BankAccounts.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter valid clientId, ClientName, Client surname, account balance");
        int i = 0;
        while (i < 3) {
            try {
                formatter.format("%d, %s, %s, %.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextFloat());
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Input is incorrect.Please try again");
                scanner.nextLine();
            }
        }
        formatter.close();

    }

    private static void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_MAME));
        String c;
        while ((c = reader.readLine()) != null) {
            System.out.println(c);
        }
    }

    private static void readFile(NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_MAME))) {

            for (AverageStudentGrade gradeKey : grades.keySet()) {
                writer.write("=============================\n");
                writer.write("Student: " + gradeKey.getName() + " Average grade: " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {
                    writer.write("Subject: " + grade.getSubject() + " Grade: " + grade.getGrade() + "\n");
                }
            }
        }
    }
}
