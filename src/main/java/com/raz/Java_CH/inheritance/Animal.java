package com.raz.Java_CH.inheritance;

public class Animal {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("This animal eats");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
