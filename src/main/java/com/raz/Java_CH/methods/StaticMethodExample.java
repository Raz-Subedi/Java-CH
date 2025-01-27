package com.raz.Java_CH.methods;

public class StaticMethodExample {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println(StaticMethodExample.multiply(3, 4));
    }
}
