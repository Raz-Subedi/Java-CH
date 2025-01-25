package com.raz.Java_CH.Operators;

public class InstanceOf {
    public static void main(String[] args) {
        // Create objects of different types
        String text = "Hello, world!";
        String texter = new String("asd");
        Integer number = 42;

        // Check instances
        System.out.println("text is an instance of String: " + (text instanceof String)); // true
        System.out.println("number is an instance of Integer: " + (number instanceof Integer)); // true
        System.out.println("text is an instance of Object: " + (text instanceof Object)); // true
        System.out.println("number is an instance of Object: " + (number instanceof Object)); // true

        // Check unrelated types
       // System.out.println("text is an instance of Integer: " + (number instanceof String)); // false
    }
}
