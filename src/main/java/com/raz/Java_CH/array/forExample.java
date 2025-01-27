package com.raz.Java_CH.array;

public class forExample {
    public static void main(String[] args) {

        String strArray[] = {"Python", "Java", "C++", "C", "PHP"};

        int lengthOfArray = strArray.length;

        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println(strArray[i]);
        }

        for (long i = 0; i < lengthOfArray; i++) {
            System.out.println(i);
        }
    }
}
