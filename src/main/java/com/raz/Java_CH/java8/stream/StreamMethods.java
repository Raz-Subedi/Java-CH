package com.raz.Java_CH.java8.stream;

import java.util.List;

public class StreamMethods {
    public static void main(String[] args) {

        //filter(Predicate)  returns true or false
            /*Predicate means boolean value function
             e -> e>10*/



        //Map(Function)   returns value/element
            //We can perform operations on each element

        List<String>  names = List.of("Aman","Ankit","Abhinav","Durgesh","Raz","Ram","Ramesh","Raju");
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).toList();
        System.out.println(newNames);

        names.stream().filter(e -> e.startsWith("R")).forEach(e -> System.out.println(e));


    }
}
