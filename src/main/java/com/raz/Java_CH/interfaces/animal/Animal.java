package com.raz.Java_CH.interfaces.animal;

public interface Animal {

    public static final int MAX_AGE = 150;  // By default static constants

    public abstract void eat();   // By default abstract method.
    void sleep();

    public static void info(){
        System.out.println("This is an Animal interface");
    }

    public default void run(){
        this.eat();
        System.out.println("Animal is running");
    }
}
