package com.raz.Java_CH.Operators;


public class Unary {
    public static void main(String[] args)
    {

        int a = 10;
        int b = -10;

        System.out.println(Integer.toBinaryString(a));
        a=~a;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(-b);
        System.out.println(+a);
        System.out.println(+b);


//        System.out.println("Postincrement : " + (a++));
//        System.out.println("Preincrement : " + (++a));
//
//        System.out.println("Postdecrement : " + (b--));
//        System.out.println("Predecrement : " + (--b));
    }
}