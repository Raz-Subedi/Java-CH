package com.raz.Java_CH.inheritance;

public class Parent extends Grandparent{
    public Parent(int age,String name){
        super(age,name);
        System.out.println("Parent Constructor called.");
    }

    public void parentMethod(){
        System.out.println("Parent Method Called.");
    }
}
