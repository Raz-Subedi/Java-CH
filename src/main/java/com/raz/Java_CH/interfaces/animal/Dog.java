package com.raz.Java_CH.interfaces.animal;

import com.raz.Java_CH.interfaces.animal.Animal;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is Sleeping");
    }
}
