package com.raz.Java_CH.polymorphism;

import com.raz.Java_CH.inheritance.Animal;
import com.raz.Java_CH.inheritance.Cat;
import com.raz.Java_CH.inheritance.Dog;

public class Test {
    public static void main(String[] args) {

        Animal myanimal = new Animal();
        myanimal.sayHello();

        Animal dog = new Dog(); // upcasting
        dog.sayHello();

        Animal cat = new Cat();
        cat.sayHello();


        Dog myDog = (Dog) dog; //downCasting

        double d = 2.22247;
        int i = (int) d;   // downCasting
        System.out.println(i);

        
    }
}
