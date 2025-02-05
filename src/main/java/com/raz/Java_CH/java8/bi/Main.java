package com.raz.Java_CH.java8.bi;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // Bi Predicate
        Predicate<Integer> predicateThatCheckEven = x -> x%2 == 0;
        BiPredicate<Integer,Integer> biPredicate = (x,y) -> x%2 == 0 && y%2 == 0;
        System.out.println(biPredicate.test(2,4));

        BiPredicate<String,Integer> biPredicate1 = (str,x) -> str.length() == x;
        System.out.println(biPredicate1.test("Vipul", 5));

        // Bi Function
        Function<String,Integer> function = str -> str.length();
        System.out.println(function.apply("Vipul"));

        BiFunction<String,String,Integer> biFunction = (x,y) -> x.length() + y.length();
        System.out.println(biFunction.apply("Hi","Hello"));


        // Bi Consumer
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(67);

        BiConsumer<Integer,Integer> biConsumer = (x,y) -> System.out.println(x+y);
        biConsumer.accept(1,8);


        // Supplier
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());

        // Bi Supplier is not there because only one value can be returned
    }
}
