package com.raz.Java_CH.array;

public class JaggedArray {
    public static void main(String[] args) {

      //  In Java, a jagged array is an array of arrays where each row of the array can have a different number of columns.
        // This contrasts with a regular two-dimensional array, where each row has the same number of columns.

        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        int count = 0;
        for (int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                arr[i][j] = count++;


        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();//new line
        }
    }
}
