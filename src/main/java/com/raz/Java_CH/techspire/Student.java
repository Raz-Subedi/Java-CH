package com.raz.Java_CH.techspire;

import java.util.SortedMap;

public class Student {

    public static void main(String[] args) {

        //       University c = new Student();;

        String s = everyNth("Miracle", 2);
        System.out.println(s);
    }

    public static String everyNth(String str, int n) {
        String s = str.substring(0,1);
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
           count ++;
           if(count == n) {
               char c = str.charAt(i);
               String s1 = String.valueOf(c);
               count = 0;
               return s1;
           }
        }
        return  s;
    }

}
