package com.raz.Java_CH.string;

public class Test {
    public static void main(String[] args) {


        String n = "Rajkumar subedi";
        String name = new String("Rajkumar");


        System.out.println(name.substring(4));
        System.out.println(name.substring(2,8));
        System.out.println("Hello" +name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat("Subedi"));
        System.out.println("Mr. "+ name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.compareTo(n));
        System.out.println(name.length());

    }
}