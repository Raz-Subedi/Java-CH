package com.raz.Java_CH.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException { // Compile-time Exception
//    public static void main(String[] args) {
//        try{
//            FileReader fileReader = new FileReader("a.txt");
//        }catch (IOException e){
//            System.out.println(e);
//        }
//        System.out.println("Hello");
//        System.out.println("World");
//    }


    public static void main(String[] args) throws FileNotFoundException {
        method2();
        System.out.println("Hello");
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }
    public static void method1() throws FileNotFoundException {
        FileReader fileReader = new FileReader("a.txt");
    }
}
