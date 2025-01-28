package com.raz.Java_CH.array;

public class CopyArray {
    public static void main(String[] args) {

        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };

        char[] copyTo = new char[7];
        //copying array using System.arraycopy() method
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);

        System.out.println(String.valueOf(copyTo));
    }
}
