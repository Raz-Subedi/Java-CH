package com.raz.Java_CH.array;

import java.util.Arrays;

public class MultidimensionalArray {

    public static void main(String[] args) {

        int[][] a = new int[3][3];

//        a[0][0] = 1;
//        a[0][1] = 2;
//        a[0][2] = 3;
//        a[1][0] = 4;
//        a[1][1] = 5;
//        a[1][2] = 6;
//        a[2][0] = 7;
//        a[2][1] = 8;
//        a[2][2] = 9;


        int count = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length;j++) {
                a[i][j]= count;
                count++;
            }
            }

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }

        for(int[] row:a){
            for(int element:row) {
                System.out.println(element);
            }
        }

    }
}
