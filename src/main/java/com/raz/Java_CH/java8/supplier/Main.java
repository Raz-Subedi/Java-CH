package com.raz.Java_CH.java8.supplier;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());


        // Revise
        Predicate<Integer> predicate = x -> x%2==0;
        Function<Integer,Integer> function = x -> x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier1 = () -> 100;

        if (predicate.test(supplier1.get())){
            consumer.accept(function.apply(supplier1.get()));
        }
    }
}
