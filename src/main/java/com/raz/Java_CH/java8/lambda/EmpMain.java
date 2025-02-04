package com.raz.Java_CH.java8.lambda;

public class EmpMain {
    public static void main(String[] args) {

//        SoftwareEngineer se = new SoftwareEngineer();
//        String name = se.getName();
//        System.out.println(name);


        // Functional Interface reference can used to hold lambda expression
        Employee e = () -> "Software Engineer";
        System.out.println(e.getName());

        // Using lambda expression we don't need to use any separate implementation class.

        Employee employee = () -> "Editor";
        System.out.println(employee.getName());

    }
}
