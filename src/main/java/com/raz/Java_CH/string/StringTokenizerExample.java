package com.raz.Java_CH.string;

import java.util.StringTokenizer;

public class StringTokenizerExample {


//    StringTokenizer class in Java is used to break a string into tokens based on delimiters.
//    A StringTokenizer object internally maintains a current position within the string to be tokenized.
//    Some operations advance this current position past the characters processed.
    public static void main(String[] args) {

        String s = "Hello Geeks how are you";

        // Create a StringTokenizer object
        // with space as the delimiter
        StringTokenizer st = new StringTokenizer(s, " ");


        // Tokenize the string and print each token
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
