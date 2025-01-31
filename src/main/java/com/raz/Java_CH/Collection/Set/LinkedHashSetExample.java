package com.raz.Java_CH.Collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    // Maintains the order in which the elements are inserted.
    // Maintains the linked list of entries in set.
    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(5);
        lhs.add(4);
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);

        System.out.println(lhs);

        System.out.println(lhs.size());

        lhs.remove(4);

        System.out.println(lhs);
        System.out.println(lhs.size());

    }
}
