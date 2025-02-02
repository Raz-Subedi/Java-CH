package com.raz.Java_CH.java8.lambda;

public class Main {
    public static void main(String[] args) {

        System.out.println("My program Starts here");

//        Functional o = new Imp();
//        o.sayHello();

/*        Functional m = new Functional() {
            @Override
            public void sayHello() {
                System.out.println("This is first anonymous class");
            }
        };

        m.sayHello();;

        Functional p = new Functional() {
            @Override
            public void sayHello() {
                System.out.println("This is my second anonymous class");
            }
        };
        p.sayHello();*/


        // Using our functional interface with the help of lambda

        Functional l = () -> System.out.println("This is from the lambda");
        l.sayHello();

        Functional l2 = () -> System.out.println("This is second time using lambda");
        l2.sayHello();

        SumInterface s = (a,b) -> a+b;

        System.out.println(s.sum(5,8));
        System.out.println(s.sum(15,5));


        LengthInterface li = st -> st.length();
        System.out.println(li.Length("Raz"));
        System.out.println(li.Length("Rajkumar"));

    }
}
