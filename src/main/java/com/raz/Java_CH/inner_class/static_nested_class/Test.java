package com.raz.Java_CH.inner_class.static_nested_class;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer("HP", "ABC", "XYZ");
        computer.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("TYPE-C");
        Computer.USB usb2 = new Computer.USB("TYPE-C");

      //  String str = "Hello\u0000World";
       //  System.out.println(str); // Outputs "HelloWorld" with a null character in between.


    }
}
