package com.raz.Java_CH.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
 // Ordered not maintained of the insertion
    // Cannot have a duplicate elements.

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(99);
        hs.add(85);
        hs.add(1);
        hs.add(66);
        hs.add(12);
        hs.add(25);
        hs.add(85);

        System.out.println(hs);

        System.out.println(hs.size());
        hs.remove(85);

        System.out.println(hs);
        System.out.println(hs.size());
    }
}
