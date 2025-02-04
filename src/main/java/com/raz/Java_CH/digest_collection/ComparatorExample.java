package com.raz.Java_CH.digest_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//class StringLengthComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o2.length() - o1.length();
//    }
//}
//
//class  Descending implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2 - o1;
//    }
//}


public class ComparatorExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(15);
        list.add(45);
        list.add(25);
        list.add(98);
        list.add(6);

        list.sort((a,b) -> b-a);
        System.out.println(list);



        List<String> words = Arrays.asList("banana","apple","date");
        words.sort((a,b) -> b.length() - a.length());
        System.out.println(words);
    }
}
