package com.raz.Java_CH.array;

class Student {
    Student(int id, String name) {
        System.out.println("Student ID is "+ id + " and name is "+ name );
    }
}

public class Test {
    public static void main (String[] args) {
        // declaring an array of Object
        Student obj[] = new Student[3];

//        double[] d = new double[5];
//        d[0] = 15.5;
//        d[1] = 45.5;


        obj[0] = new Student(1,"Raz");
        obj[1] = new Student(5,"Kumar");
        obj[2] = new Student(6,"Subedi");

    }
}

