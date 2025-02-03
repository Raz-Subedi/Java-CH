package com.raz.Java_CH.java8.lambda;

public class ThreadDemo {
    public static void main(String[] args) {

        // First Thread: Thread - JOHN

        Runnable thread1 = () -> {
            // this is the body of the thread
            //stuff
            for (int i = 1; i <= 10; i++) {
                System.out.println("Value of i is " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t = new Thread(thread1);
        t.setName("JOHN");
        t.start();


        Runnable thread2 = () ->{
            for (int i = 1; i <= 10; i++) {
                System.out.println("Table of 2 " + i*2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t2 = new Thread(thread2);
        t2.start();
    }

}
