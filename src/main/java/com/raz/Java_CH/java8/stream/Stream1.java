package com.raz.Java_CH.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {

        //Create a list and filter all even numbers from list

        List<Integer> list1 = List.of(2, 4, 82, 74, 63, 24, 13, 2, 5, 7);
        //list1.add(41); cannot add here because the list of method is immutable that cannot be changed.
        //System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(32);
        list2.add(12);
        list2.add(15);
        list2.add(45);
        list2.add(41);
        list2.add(20);

        List<Integer> list3 = Arrays.asList(82, 74, 63, 24, 13, 55, 74, 10, 2, 6);

        // List1
        // Without Stream
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list1){
            if(i%2==0){
                listEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);


        //Using Stream
//        Stream<Integer> stream = list1.stream();
//        List<Integer> collect = stream.filter(i -> i % 2 == 0).toList();
//        System.out.println(collect);

        List<Integer> list = list1.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(list);

        List<Integer> newlist = list1.stream().filter(i -> i > 10).toList();
        System.out.println(newlist);
    }
}
