package com.raz.Java_CH.inheritance;

public class Test {
    public static void main(String[] args) {

/*
        Dog dog = new Dog();
        dog.setAge(15);
        dog.setName("Mike");

        dog.eat();
        dog.sayHello();*/

/*        Child child = new Child();
        child.setName("child");
        child.setAge(5);

        Parent parent = new Parent();
        parent.setAge(55);
        parent.setName("Mukesh");

        System.out.println(child.isHasSuperPowers());

        child.childMethod();*/

        Child child = new Child(15,"Raz");
        System.out.println(child.getAge());
        child.childMethod();
    }
}
