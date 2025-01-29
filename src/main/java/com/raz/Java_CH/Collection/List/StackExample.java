package com.raz.Java_CH.Collection.List;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {


        // It extends the vector class and it is its subclass.
        // LIFO

        Stack<Integer> s =  new Stack<>();

        System.out.println(s.size());

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s);
        System.out.println(s.size());

        System.out.println(s.pop());
        System.out.println(s.peek());

        System.out.println(s.size());

    }
}
