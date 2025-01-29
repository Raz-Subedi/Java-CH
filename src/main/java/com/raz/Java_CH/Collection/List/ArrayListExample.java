package com.raz.Java_CH.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> p = new ArrayList<>();
        p.add("Raz");
        p.add("Kumar");
        p.add("Subedi");
        p.add("Rajkumar");

        List<String> q = new ArrayList<>(Arrays.asList("I","Love","Java"));
        //  AsList() method in Java is used to return a fixed-size list backed by the given array.

        List<String>  r = new ArrayList<>(List.of("Coding","is","Fun"));
        // list.of It is used to return immutable lists containing the specified elements

        System.out.println(p);
        System.out.println(q);
        System.out.println(r);



        ArrayList<String> str= new ArrayList<String>();

        System.out.println("Size at the beginning "+str.size());

        str.add("Hello");
        str.add("Hi");
        str.add("Namaste");
        str.add("Bonjour");

        System.out.println(str);

        System.out.println("Size after addition "+str.size());

        str.remove(0);
        str.remove(0);

        System.out.println(str);

        System.out.println("Size after removal "+str.size());
    }
}
