package com.raz.Java_CH.java8.default_method;

interface Parent{
    default void sayHello(){
        System.out.println("Hello");
    }
}

class Child implements Parent{
    @Override
    public void sayHello() {
        Parent.super.sayHello();
        System.out.println("Child Says Hello");

    }
}
public class MyClass {
    public static void main(String[] args) {
        Parent c = new Child();
        c.sayHello();

    }
}
