package com.raz.Java_CH.java8.stream;

public class Employee {
    String name;
    int salary;
    String department;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    Employee(String name, String department){
        this.name = name;
        this.department = department;
    }
    public String toString() {
        return name + " " + salary;
    }
}
