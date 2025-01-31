package com.raz.Java_CH.array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };

        char[] copyTo = new char[7];
        //copying array using System.arraycopy() method
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);

        System.out.println(String.valueOf(copyTo));


        int[] i = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] j = new int[10];

        System.arraycopy(i,2, j, 0,8);
        System.out.println(Arrays.toString(j));
    }
}
