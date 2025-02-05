package com.raz.Java_CH.java8.lambda.variables;

public class Main {

    private static void doSomething(){
        Employee employee = () -> {
            int x = 10;
           return  "1000";
        };
        Employee employee1 = new Employee() {
            int x = 10;
            @Override
            public String getSalary() {
                System.out.println(this.x);
                return null;
            }
        };
    }
}
