package com.raz.Java_CH.java8.lambda;

public class Student {

    public Integer id;
    public String name;

    public Student(Integer id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}