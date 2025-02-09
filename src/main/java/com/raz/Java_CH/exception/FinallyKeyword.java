package com.raz.Java_CH.exception;

public class FinallyKeyword {
    public static void main(String[] args) {

        System.out.println(divide(1,0));
    }

    public static int divide(int a, int b){
        try{
            return a/b;
        }catch (Exception e){
            return -1;
        }finally {
            System.out.println("Bye");
        }

    }
}
