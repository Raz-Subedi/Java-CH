package com.raz.Java_CH.java8.lambda;

public class DigestThreadMain {
    public static void main(String[] args) {

        //       DigestThread dt = new DigestThread();

        Runnable runnable = () -> {
            for (int i = 1; i < 10; i++) {
                System.out.println("Hello " + i);
            }
        };
            Thread childthread = new Thread(runnable);
            childthread.run();

//        for (int i = 1; i < 10; i++) {
//            System.out.println("Bye " + i);
//        }
        }
    }
