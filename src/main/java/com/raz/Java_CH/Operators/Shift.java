package com.raz.Java_CH.Operators;

public class Shift {
    public static void main(String[] args)
    {
        int a = 2;
        int b = -2;

        // Using left shift
        System.out.println("a<<1 : " + (a << 1));

        // Using signed right shift
        System.out.println("a>>1 : " + (a >> 1));

        // Using unsigned right shift
        System.out.println(a>>>1);
        System.out.println(b>>>1);

    }
}
