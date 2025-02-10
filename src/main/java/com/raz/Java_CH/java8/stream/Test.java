package com.raz.Java_CH.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        // Print a list using lambda expressions.
        List<String> list =Arrays.asList("ALice","Raz","Bob","Bob","Raz","Kumar","Subedi");
        list.stream().forEach(name -> System.out.println(name));


        // Filter even numbers from a list using Streams.
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        numbers.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));


        // Find the maximum value in a list using Streams
        Integer integer = numbers.stream().max(Integer::compare).get();
        System.out.println("The maximum number is " +integer);

        // Convert a list of strings to uppercase
        List<String> list1 = list.stream().map(x -> x.toUpperCase()).toList();
        System.out.println(list1);

        // Group strings by their length using groupingBy().
        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(collect);

        //Find the sum of numbers using reduce().
        Integer reduce = numbers.stream().reduce(0, (x, y) -> x + y);
        System.out.println(reduce);

        //Count word occurrences in a list using groupingBy()
        Map<String, Long> collect1 = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect1);

        // Concatenate strings using joining().
        String collect2 = list.stream().collect(Collectors.joining(" "));
        System.out.println(collect2);
    }
}
