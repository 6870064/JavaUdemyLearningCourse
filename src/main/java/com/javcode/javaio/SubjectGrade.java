package com.javcode.javaio;

public class SubjectGrade {
    private final int grade;
    Subject subject;

    public SubjectGrade(Subject subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectGrade grade1 = (SubjectGrade) o;

        if (grade != grade1.grade) return false;
        return subject != null ? subject.equals(grade1.subject) : grade1.subject == null;
    }

    @Override
    public String toString() {
        return "Grade: " + subject + " Grade:" + grade;
    }
}
