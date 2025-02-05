package com.raz.Java_CH.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(2,"Vipul");
        Student s2 = new Student(3,"Raj");
        Student s3 = new Student(33,"Akshit");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list,(a,b) -> b.id - a.id);
        System.out.println(list);
    }
}
