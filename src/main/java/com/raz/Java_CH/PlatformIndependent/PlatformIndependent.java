package com.raz.Java_CH.PlatformIndependent;

public class PlatformIndependent {

    void Window(){
        System.out.println("I am in Window");
    }

    void Ubuntu(){
        System.out.println("I am from Ubuntu");
    }

    void Mac(){
        System.out.println("I am from Mac");
    }

    public static void main(String[] args) {
        PlatformIndependent pi = new PlatformIndependent();
        pi.Mac();
        pi.Ubuntu();
        pi.Window();
    }
}
