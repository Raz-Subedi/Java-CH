package com.raz.Java_CH.java8.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> function = x -> x.length();
        System.out.println(function.apply("Razkumar"));

        Function<String, String> function2 = x -> x.substring(0, 3);

        Function<List<Student>, List<Student>> studentsWithVipAsPrefix = li -> {
            List<Student> result = new ArrayList<>();
            for (Student s : li) {
                if (function2.apply(s.getName()).equalsIgnoreCase("vip")) {
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 = new Student(1, "vipRaz");
        Student s2 = new Student(2, "viparnav");
        Student s3 = new Student(3, "viprazav");
        Student s4 = new Student(4, "vipRazvip");
        List<Student> students = Arrays.asList(s1, s2, s3,s4);
        List<Student> filteredStudents = studentsWithVipAsPrefix.apply(students);
        System.out.println(filteredStudents);
    }
}
