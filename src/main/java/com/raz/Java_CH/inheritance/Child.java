package com.raz.Java_CH.inheritance;

public class Child extends Parent{

    public Child(int age,String name){
        super(age,name);
        System.out.println("Child Constructor called.");
    }

    public void childMethod(){
        System.out.println("Child method called.");
        super.parentMethod(); // super refers to immediate parent
    }

}
