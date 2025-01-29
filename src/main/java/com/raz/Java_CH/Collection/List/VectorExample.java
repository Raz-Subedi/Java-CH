package com.raz.Java_CH.Collection.List;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        // Used for dynamic array
        // It is synchronized

        Vector<Integer> v= new Vector<>();

        System.out.println("Size at the beginning "+v.size());

        v.add(19);
        v.add(88);
        v.add(1);
        v.add(39);

        System.out.println(v);
        v.add(4,50);

        System.out.println(v);
        System.out.println("Size after addition "+v.size());

        v.remove(3);

        System.out.println(v);

        System.out.println("Size after removal "+v.size());
    }

}
