package com.raz.Java_CH.interfaces.animal;

import com.raz.Java_CH.interfaces.animal.Animal;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is Sleeping");
    }
}
