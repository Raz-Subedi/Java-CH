package com.raz.Java_CH.exception;

public class Finally2 {
    public static void main(String[] args) {

        try{
            System.out.println("Inside try Block");
            int a = 10/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("I will execute anyway ");
        }
    }
}
