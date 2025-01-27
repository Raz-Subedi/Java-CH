package com.raz.Java_CH.string;

import java.util.StringJoiner;

public class StringJoinerExample {

//    StringJoiner class in Java provides an efficient way to concatenate multiple strings with a defined delimiter(character), optional prefix, and suffix.
//            This class is especially useful when constructing formatted strings dynamically.
    public static void main(String[] args) {

        // Create a StringJoiner with a delimiter
        StringJoiner sj = new StringJoiner(", ");

        // Add strings which you need to join
        sj.add("geeks").add("for").add("geeks");

        System.out.println("Joined String: " + sj.toString());
    }
}
