package com.raz.Java_CH.final_keyword;

public class ReferenceVariableExample {
    public static void main(String[] args) {

        final StringBuffer s = new StringBuffer("Raz");  // if not declared final here we can change the reference.
        System.out.println(s);
    //    s = s.append("Kumar");  // Here we cannot change the reference of the s but the object's property can be changed
        s.append("Kumar");
        System.out.println(s);
    }
}
