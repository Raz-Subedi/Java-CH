package com.raz.Java_CH.coding;

public class Test {

    public static String Not(String str){


       // String ss = str.substring(0,3);
        String s1[] = str.split(" ");
     //   System.out.println(ss);

        if(s1[0].equals("not"))
            return str;

        return  "not "+ str;
    }

    public static void main(String[] args) {

        String s = Not("raz");
        System.out.println(s);

        String s1 = Not("not raj");
        System.out.println(s1);

    }
}
