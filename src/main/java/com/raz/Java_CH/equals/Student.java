package com.raz.Java_CH.equals;

public class Student {
    private int enrollmentNumber;
    private String name;
    private String courseName;
    private int score;

    public Student(int enrollmentNumber, String name, String courseName, int score) {
        this.enrollmentNumber = enrollmentNumber;
        this.name = name;
        this.courseName = courseName;
        this.score = score;
    }

    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
