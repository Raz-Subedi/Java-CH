package com.raz.Java_CH.java8.unary_operator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {


        // Unary Operator
        Function<Integer,Integer> function = x -> x*x;
        Function<String, String> function1 = str -> str.toLowerCase();

        UnaryOperator<Integer> unaryOperator = x -> x *x;
        System.out.println(unaryOperator.apply(5));

        UnaryOperator<String> unaryOperator1 = str -> str.toUpperCase();
        System.out.println(unaryOperator1.apply("razkumar"));

        // Binary Operator

        BiFunction<String,String,String> biFunction = (str1,str2) -> str1+str2;

        BinaryOperator<String> binaryOperator =(str1,str2) -> str1+str2;
        System.out.println(binaryOperator.apply("Hello","World"));
    }
}
