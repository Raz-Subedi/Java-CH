package com.raz.Java_CH.java8.method_reference;

public class Main {
    public static void main(String[] args) {

        System.out.println("Learning Method References..");

        //Provide the implementation of Work Interface

        WorkInterface wi = () -> System.out.println("This is do task new method");
        wi.doTask();


        // Static Method lai refer gareko
        // ClassName::methodName
        WorkInterface workInter = Stuff::doStuff;
        workInter.doTask();


        Runnable runnable = Stuff::threadTask;
        Thread d = new Thread(runnable);
        d.start();



    // Referring non static method
    //Object::methodName
    Stuff s = new Stuff();
        Runnable run = s::printNumber;
        Thread e = new Thread(run);
         e.start();

    }
}
