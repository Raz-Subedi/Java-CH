package com.raz.Java_CH.methods;

public class InstanceMethodExample {

    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {

        InstanceMethodExample calc = new InstanceMethodExample();
        System.out.println(calc.add(5, 10));

    }
}
