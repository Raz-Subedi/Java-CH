package com.raz.Java_CH.techspire;

import java.util.SortedMap;

public class Student extends College implements University{

    public static void main(String[] args) {

        College c = new Student();



    }
//    public static String everyNth(String str, int n) {
//        String s2 = null;
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            String s1 = String.valueOf(c);
//            count++;
//            if ((i > 1) && (count == n)){
//              String s2 = s1.concat(s1);
//            }
//        }
//        return s2;
//    }

}
