package com.raz.Java_CH.interfaces.animal;

import com.raz.Java_CH.interfaces.animal.Animal;
import com.raz.Java_CH.interfaces.animal.Cat;
import com.raz.Java_CH.interfaces.animal.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        System.out.println(dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.run();
        dog.run();
    }
}
