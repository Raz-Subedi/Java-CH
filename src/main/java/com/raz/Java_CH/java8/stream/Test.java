package com.raz.Java_CH.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        // Print a list using lambda expressions.
        List<String> list = Arrays.asList("Alice", "Raz", "Aob", "Bob", "Raz", "Kumar", "Subedi");
        list.stream().forEach(name -> System.out.println(name));


        // Filter even numbers from a list using Streams.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        numbers.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));


        // Find the maximum value in a list using Streams
        Integer integer = numbers.stream().max(Integer::compare).get();
        System.out.println("The maximum number is " + integer);

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

        //Sort employees by salary
        List<Employee> list2 = List.of(new Employee("Raj", 50000), new Employee("Kumar", 5230), new Employee("Anjan", 789000), new Employee("Dhiraj", 456120));
        list2.stream().sorted((a, b) -> b.salary - a.salary).forEach(System.out::println);

        // Find the first non-repeated character in a string
        String input = "swiss";
        Character result = input.chars().mapToObj(c -> (char) c).filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch)).findFirst().orElse(null);
        System.out.println(result);

        //Use Stream.distinct() to remove duplicates from a list
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 56, 7, 8, 9);
        integers.stream().distinct().forEach(System.out::println);

        // Find all elements starting with "A" in a list.
        List<String> a1 = list.stream().filter(x -> x.startsWith("A")).toList();
        System.out.println(a1);

        // Sort a list of strings alphabetically and in reverse order.
        List<String> list4 = list.stream().sorted((a, b) -> a.compareTo(b)).toList();
        System.out.println(list4);
        List<String> list5 = list.stream().sorted((a, b) -> b.compareTo(a)).toList();
        System.out.println(list5);

        // Flatten a lists using flatMap().
        List<List<Integer>> lists = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9), List.of(10, 11, 12), List.of(13, 14, 15));
        List<Integer> list3 = lists.stream().flatMap(List::stream).toList();
        System.out.println(list3);

        // Use Collectors.partitioningBy() to separate even and odd numbers.
        Map<Boolean, List<Integer>> collect3 = numbers.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));
        System.out.println(collect3);

        // Find the second highest number in a list.
        Integer i = numbers.stream().sorted((a,b) -> b-a).skip(1).findFirst().get();
        System.out.println(i);

        // Count the frequency of characters in a string using Streams.
        Map<Character, Long> collect4 = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect4);

        // Generate an infinite Stream of even numbers and limit it to 10 elements
        Stream.iterate(0,n -> n+2).limit(10).forEach(System.out::println);

        // Check if all elements in a list are greater than a given number.

        List<Integer> list6 = Arrays.asList(5, 7, 10, 12, 15, 17, 20, 25);
        boolean b = list6.stream().allMatch(e -> e > 4);
        System.out.println(b);

        // Find the average of a list of numbers
        double v = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(v);

        //Generate the Fibonacci series using Stream.iterate().
        Stream.iterate(new int[]{0,1},f -> new int[]{f[1],f[0]+f[1]}).limit(10).map(f ->f[0]).forEach(System.out::println);

        // Group employees by department using Collectors.groupingBy().
        List<Employee> list7 = Arrays.asList(new Employee("Raz", "Java"), new Employee("Kumar", "Java"), new Employee("Anjan", "Phyton"), new Employee("Dhiraj", "Phyton"), new Employee("Sanam", "Admin"));
        Map<String, List<Employee>> collect5 = list7.stream().collect(Collectors.groupingBy(emp -> emp.department));
        System.out.println(collect5);

    }

}
