package com.raz.Java_CH.java8;

import java.util.function.Supplier;

public class MethodReference {

    public static String meth(){
        String s ="askasdkagskdd";

        //implementation

        return s;
    }
    public static void main(String[] args) {
        Supplier k = MethodReference::meth;
        System.out.println(k.get());

        System.out.println(KK.kn.get());


    }
}
