package com.raz.Java_CH.array;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        // declaring and initializing an array
        int[] myArray = { 2, 3, 4, 5, 6 };

        // print array element at index 0
        System.out.println("Before change myArray[0]: " + myArray[0]);

        // changing the array element
        myArray[0] = 1;

        // print array element at index 0
        System.out.println("After change myArray[0]: " + myArray[0]);

        long[] l = {1,2,3,4,5};

        for (long i : l){
            System.out.println(i);
        }

//        for(int m : myArray) {
//            System.out.println(m);
//        }

        System.out.println(Arrays.toString(myArray));
    }
}

