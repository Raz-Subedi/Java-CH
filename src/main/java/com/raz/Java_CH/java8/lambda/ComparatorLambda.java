package com.raz.Java_CH.java8.lambda;

import java.util.*;

public class ComparatorLambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(55);
        list.add(15);
        list.add(1);
        list.add(30);
        list.add(21);

        // Descending d = new Descending();  No need to implement the Comparator and make seperate class for this
        // We can simply use lambda here.
        Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);


        Set<Integer> s = new TreeSet<>();
        s.add(22);
        s.add(1);
        s.add(13);
        System.out.println("Before Manual Sorting "+ s);

        Set<Integer> ss = new TreeSet<>((a,b) -> b-a);
        ss.add(22);
        ss.add(1);
        ss.add(13);
        System.out.println("After manual Sorting " +ss);

        Map<Integer,String> m = new TreeMap<>();
        m.put(2,"z");
        m.put(3,"f");
        m.put(1,"y");
        System.out.println("Before Manual Sorting "+m);

        Map<Integer,String> mm = new TreeMap<>((a,b) -> b-a);
        mm.put(2,"z");
        mm.put(3,"f");
        mm.put(1,"y");
        System.out.println("After Manual Sorting "+ mm);

    }
}
