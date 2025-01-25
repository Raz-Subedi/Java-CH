package com.raz.Java_CH.Collection;

import java.util.*;

public class Test {

    public static void main(String[] args) {
//        Set<Student> studentSet = new HashSet<>();
//        Student student = new Student("A",2);
//        Student student1 = new Student("b",234);
//
//        studentSet.add(student1);
//        studentSet.add(student);
//
//
//        System.out.println(student1);
//        System.out.println(student);
//
//
//        System.out.println(studentSet.toString());




//        Set<Integer> integers = new HashSet<>();
//        integers.add(2);
//        integers.add(3);
//        System.out.println(integers);


        List<Student> students = Arrays.asList(new Student("RajKuamr",3),new Student("Phuyal",1),new Student("Diraj",2));

        List<Integer> integerList = Arrays.asList(7,3,4,2);


        for (Integer integer : integerList){
            System.out.println(integer);
        }

        Collections.sort(integerList);
        System.out.println("After sort");

        for (Integer integer : integerList){
            System.out.println(integer);
        }

        System.out.println("Student");

        for (Student student : students){
            System.out.println(student);
        }

        System.out.println("After st");

//        List<Student> sortedStudent= students.stream().sorted().toList();
//
//        for (Student student : sortedStudent){
//            System.out.println(student);
//        }
//        Collections.sort(students);
//
//
//


        System.out.println("asc roll sort");
        Collections.sort(students,new SortWithStudentName());

        for (Student student : students){
            System.out.println(student);
        }







    }
}
