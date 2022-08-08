package com.company.javaio;

import java.util.*;

public class TreeMapRunner {
    public static void main(String[] args) {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = createGrades();
        printGrades(grades, false);
        AverageStudentGrade border = grades.ceilingKey(new AverageStudentGrade("", 80));
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> scolarshipStudents = (NavigableMap<AverageStudentGrade, Set<SubjectGrade>>) grades.headMap(border);
        System.out.println("=======================================");
        System.out.println("Scolarship students");
        printGrades(scolarshipStudents.descendingMap(), false);
        System.out.println("Contender student");
        AverageStudentGrade contender = grades.lowerKey(border);
        System.out.println(contender);
        System.out.println("The highest grade student");
        System.out.println(scolarshipStudents.descendingMap().firstEntry());


    }

    public static void printGrades(Map<AverageStudentGrade, Set<SubjectGrade>> grades, boolean printValue) {
        Set<AverageStudentGrade> averageStudentGrades = grades.keySet();
        for (AverageStudentGrade gr : averageStudentGrades) {
            System.out.println(gr);
            if (printValue) {
                System.out.println(grades.get(gr));
            }
        }
    }

    static NavigableMap<AverageStudentGrade, Set<SubjectGrade>> createGrades() {
        Set<SubjectGrade> alexGrades = new HashSet<>();
        alexGrades.add(new SubjectGrade(Subject.MATHEMATICS, 89));
        alexGrades.add(new SubjectGrade(Subject.PHYSICS, 65));
        alexGrades.add(new SubjectGrade(Subject.HISTORY, 95));
        alexGrades.add(new SubjectGrade(Subject.LITERATURE, 90));
        alexGrades.add(new SubjectGrade(Subject.CHEMISTRY, 75));

        Set<SubjectGrade> jamesGrades = new HashSet<>();
        jamesGrades.add(new SubjectGrade(Subject.MATHEMATICS, 75));
        jamesGrades.add(new SubjectGrade(Subject.PHYSICS, 80));
        jamesGrades.add(new SubjectGrade(Subject.HISTORY, 55));
        jamesGrades.add(new SubjectGrade(Subject.LITERATURE, 70));
        jamesGrades.add(new SubjectGrade(Subject.CHEMISTRY, 80));

        Set<SubjectGrade> anthonyGrades = new HashSet<>();
        anthonyGrades.add(new SubjectGrade(Subject.MATHEMATICS, 93));
        anthonyGrades.add(new SubjectGrade(Subject.PHYSICS, 91));
        anthonyGrades.add(new SubjectGrade(Subject.HISTORY, 82));
        anthonyGrades.add(new SubjectGrade(Subject.LITERATURE, 78));
        anthonyGrades.add(new SubjectGrade(Subject.CHEMISTRY, 88));

        Set<SubjectGrade> victorGrades = new HashSet<>();
        victorGrades.add(new SubjectGrade(Subject.MATHEMATICS, 73));
        victorGrades.add(new SubjectGrade(Subject.PHYSICS, 65));
        victorGrades.add(new SubjectGrade(Subject.HISTORY, 75));
        victorGrades.add(new SubjectGrade(Subject.LITERATURE, 66));
        victorGrades.add(new SubjectGrade(Subject.CHEMISTRY, 50));

        Set<SubjectGrade> alinaGrades = new HashSet<>();
        alinaGrades.add(new SubjectGrade(Subject.MATHEMATICS, 90));
        alinaGrades.add(new SubjectGrade(Subject.PHYSICS, 70));
        alinaGrades.add(new SubjectGrade(Subject.HISTORY, 78));
        alinaGrades.add(new SubjectGrade(Subject.LITERATURE, 88));
        alinaGrades.add(new SubjectGrade(Subject.CHEMISTRY, 89));

        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> map = new TreeMap<>();
        map.put(new AverageStudentGrade("Alex", calcAverage(alexGrades)), alexGrades);
        map.put(new AverageStudentGrade("James", calcAverage(jamesGrades)), jamesGrades);
        map.put(new AverageStudentGrade("Anthony", calcAverage(anthonyGrades)), anthonyGrades);
        map.put(new AverageStudentGrade("Victor", calcAverage(victorGrades)), victorGrades);
        map.put(new AverageStudentGrade("Alina", calcAverage(alinaGrades)), alinaGrades);

        return map;

    }

    private static float calcAverage(Set<SubjectGrade> grades) {
        float sum = 0f;
        for (SubjectGrade sg : grades) {
            sum += sg.getGrade();
        }
        return sum / grades.size();
    }


}
