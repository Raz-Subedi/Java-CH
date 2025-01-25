package com.raz.Java_CH.reverse;

public class Test {   // Count the number of digit in the Number.

    public static void main(String[] args) {

        int c = 0;
        int n = 2546789;
        while(n>0){
            n = n/10;
            c++;
        }
        System.out.println(c);
    }
}
