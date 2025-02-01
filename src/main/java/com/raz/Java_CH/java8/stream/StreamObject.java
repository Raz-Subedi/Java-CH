package com.raz.Java_CH.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {


    //Stream API - Collection lai process garxa.
    // Collection and group of object like array.

     // WAYS OF CREATING STREAM
    //1. Creating blank stream.
    Stream<Object> emptyStream = Stream.empty();
    emptyStream.forEach(e -> System.out.println(e));

    //2. Array, Object, Collection stream of
    String[] names = {"Durgesh","Uttam","Ankit","Divya"};
    Stream<String> stream1 = Stream.of(names);
    stream1.forEach(e -> System.out.println(e));
    
    //3.Using Stream Builder
        Stream<Object> streamBuild = Stream.builder().build();

    //4. Using Arrays Stream Methods
        IntStream streamArray =  Arrays.stream(new int[]{1, 5, 6, 7, 8, 75, 45, 15, 36});
        streamArray.forEach(System.out::println);

    //5. List,Set
        List<Integer> list2 = new ArrayList<>();
        list2.add(32);
        list2.add(12);
        list2.add(15);
        list2.add(45);
        list2.add(41);
        list2.add(20);

        list2.stream().forEach(System.out::println);


    }

}
