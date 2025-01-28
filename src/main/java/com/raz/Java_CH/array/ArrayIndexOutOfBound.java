package com.raz.Java_CH.array;

public class ArrayIndexOutOfBound {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10};

        a[5] = 13;
        // a[13] = 44;                    This also throws array index out of bound exception.

//        for(int i=0; i<=a.length; i++ ){
//            System.out.println(a[i]);
//        }
    }
}
