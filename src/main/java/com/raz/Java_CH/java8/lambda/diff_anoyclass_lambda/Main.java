package com.raz.Java_CH.java8.lambda.diff_anoyclass_lambda;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee()
        {
            @Override
            public String getSalary() {
                return "100";
            }

            @Override
            public String getDesignation() {
                return "Software Engineering";
            }
        };
        System.out.println(employee.getSalary());
    }
}
