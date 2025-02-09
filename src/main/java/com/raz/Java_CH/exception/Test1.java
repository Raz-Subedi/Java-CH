package com.raz.Java_CH.exception;

import com.raz.Java_CH.array.ArrayIndexOutOfBound;
import com.raz.Java_CH.equals.Student;

public class Test1 {
    public static void main(String[] args) {
        int[] numerators = {10,200,30,40};
        int[] denominators = {1,2,0,4};
        for(int i=0;i<10;i++){
            try {
                System.out.println(divide(numerators[i], denominators[i]));
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        System.out.println("Good Job :");
    }

    public static int divide(int a, int b){
       try {
           Student student = null;
           student.setScore(56);
           System.out.println(student.getScore());

           return a / b;
       }catch (ArithmeticException | NullPointerException e){   // should be disjoint exception not parent and subclass exception
           System.out.println("My Arithmetic/NullPointer exception ");
           return -1;
       }catch (RuntimeException e){
           System.out.println("My Runtime Exception ");
           return -1;
       }catch (Exception e) {
           System.out.println(e);
           return  -1;
       }
    }
}
