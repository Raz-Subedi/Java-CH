package com.raz.Java_CH.array;

public class ReturnArray {


        static int[] get () {
            return new int[]{10, 30, 50, 90, 60};
        }

        public static void main (String args[]){

            int arr[] = get();

//            for (int i = 0; i < arr.length; i++)
//                System.out.println(arr[i]);                   //Using for loop

            for(int a :arr){
                System.out.println(a);                          // Using foreach loop
            }
        }
}
