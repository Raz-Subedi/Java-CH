package com.raz.Java_CH.string;

public class Test {
    public static void main(String[] args) {


        String n = "Rajkumar subedi";
        String name = new String("Rajkumar");

        System.out.println("Hello" +name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat("Subedi"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.compareTo(n));
        System.out.println(name.length());


        StringBuffer s = new StringBuffer("raz");
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.append(12));
        System.out.println(s.insert(5,"Subedi"));

    }
}