package com.raz.Java_CH.Collection;

import java.util.Objects;

public class Student implements Comparable{

    String name;
    int rollnumber;

    public Student(String name, int rollnumber) {
        this.name = name;
        this.rollnumber = rollnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollnumber=" + rollnumber +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if(this.rollnumber > student.rollnumber){
            return 1;
        }
        if(this.rollnumber < student.rollnumber){
            return -1;
        }
        return 0;
    }
}
