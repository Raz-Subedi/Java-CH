package com.raz.Java_CH.java8.lambda;

public class DigestThread implements Runnable {

    @Override
    public void run() {
        for(int i=1;i<10;i++){
            System.out.println("Hello "+i);
        }
    }
}
