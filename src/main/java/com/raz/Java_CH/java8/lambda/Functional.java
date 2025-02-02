package com.raz.Java_CH.java8.lambda;

@FunctionalInterface
public interface Functional {
    public abstract void sayHello();

}

// WAYS OF IMPLEMENTING THIS INTERFACE

// 1. Create separate class and implement this class.
// 2. Anonymous class for implementing interfaces.
// 3. Lambda Expression