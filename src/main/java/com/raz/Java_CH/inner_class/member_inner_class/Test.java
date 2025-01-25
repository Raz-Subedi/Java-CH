package com.raz.Java_CH.inner_class.member_inner_class;

import com.raz.Java_CH.inner_class.member_inner_class.Car;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Fronx");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
    }
}
