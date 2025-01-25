package com.raz.Java_CH.Operators;

public class Ternary {
    public static void main(String[] args) {
        int number = 5;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number " + number + " is " + result + ".");

        int a = 10, b = 20;

        // Using the ternary operator
        int max = (a > b) ? (a>10) ? 1 : 3 : b;

        System.out.println("The maximum is: " + max);
    }
}
