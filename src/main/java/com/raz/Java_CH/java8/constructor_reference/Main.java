package com.raz.Java_CH.java8.constructor_reference;

public class Main {
    public static void main(String[] args) {

        System.out.println("Learning Constructor Reference");

//        Provider provider = () -> new Student();
//
//        Student student = provider.getStudent();
//        student.display();



        // Using Constructor Reference
        Provider provider = Student::new;
        Student student = provider.getStudent();
         student.display();
    }
}
