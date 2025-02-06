package com.raz.Java_CH.java8.stream;

import java.util.List;

public class StreamMethods {
    public static void main(String[] args) {

        //filter(Predicate)  returns true or false
            /*Predicate means boolean value function
             e -> e>10*/


        //Map(Function)   returns value/element
        //We can perform operations on each element

        List<String> names = List.of("Aman", "Ankit", "Abhinav", "Durgesh", "Raz", "Ram", "Ramesh", "Raju");
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).toList();
        System.out.println(newNames);

        names.stream().filter(e -> e.startsWith("R")).forEach(e -> System.out.println(e));

        List<Integer> numbers = List.of(1,2,45,10,20,30,25,36,78,95,64,25,14,34);
        List<Integer> list = numbers.stream().map(e -> e * e).toList();
        System.out.println(list);

        numbers.stream().map(e -> 2*e).forEach(System.out::println);

        names.stream().forEach(e -> System.out.println(e));

        //Sorted
        numbers.stream().sorted().forEach(System.out::println);

        //Minimum
        Integer integer = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Minimum" +integer);

        //Maximum
        Integer max = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Maximum " +max);


        List<Integer> number = List.of(1, 2, 3, 4, 5);

        number.stream()
                .peek(n -> System.out.println("Before filtering: " + n))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("After filtering: " + n))
                .map(n -> n * 10)
                .peek(n -> System.out.println("After mapping: " + n))
                .forEach(System.out::println);

        Integer integer1 = number.stream().reduce(Integer::sum).get();
        System.out.println(integer1);
    }
}
