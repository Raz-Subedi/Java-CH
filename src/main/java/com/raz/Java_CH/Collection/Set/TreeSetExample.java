package com.raz.Java_CH.Collection.Set;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Raz");
        ts.add("Kumar");
        ts.add("Subedi");
        ts.add("Raj");
        ts.add("Ram");
        ts.add("Hari");

        System.out.println(ts);
        System.out.println(ts.size());

        ts.remove("Ram");

        System.out.println(ts);
        System.out.println(ts.size());

        ts.add("Animal");
        System.out.println(ts);
    }
}
