package com.raz.Java_CH.java8.method_reference;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Stuff {

    public static void doStuff() {
        System.out.println("I am doing task");
        System.out.println("I am second line");
        LocalDate now = LocalDate.now();
        System.out.println(now);
    }

    public static void threadTask() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printNumber() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
