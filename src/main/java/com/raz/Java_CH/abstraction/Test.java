package com.raz.Java_CH.abstraction;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


//        Animal dog = new Dog();
//
//        int a = 5;
//        System.out.println(a++);
        for(int i=0; i<10; ++i){
            System.out.println(i);
        }

        String s = "raz";
        String s1 = new String("raz");
        System.out.println(s==s1);


        String c = new String("Roshan");
        c = new String("Ananata");
        c.toString();

        long[] l = new long[55];
        l[0] = 1;
        l[1] = 2;
        l[2] = 3;
        l[3] = 4;
        l[4] = 5;
        System.out.println(Arrays.toString(l));

        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at (" + i + "," + j + "): " + matrix[i][j]);
            }
        }




    }

}
