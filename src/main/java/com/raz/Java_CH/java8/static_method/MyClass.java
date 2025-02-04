package com.raz.Java_CH.java8.static_method;

interface A {
    static void sayHello() {
        System.out.println("Hello !");
    }
}

public class MyClass implements A {

    static void sayHello(){              // This is not overriding
        System.out.println("Hello !");   // Because the static method of the interface is not seen by the implementing class.
    }


    public static void main(String[] args) {
       // MyClass obj = new MyClass();
        // obj.sayHello();                Cannot access the static method of interface like this.
        //  MyClass.sayHello();          Cannot access the static method of interface like this.

        A.sayHello();  //  This is the only way to call the static method of the interface.
    }
}
