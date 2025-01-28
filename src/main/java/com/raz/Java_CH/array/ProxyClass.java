package com.raz.Java_CH.array;

public class ProxyClass {
    public static void main(String[] args) {

        int arr[]={4,4,5};

        //getting the class name of Java array
        Class c=arr.getClass();
        String name=c.getName();


        //printing the class name of Java array
        System.out.println(name);
    }
}
