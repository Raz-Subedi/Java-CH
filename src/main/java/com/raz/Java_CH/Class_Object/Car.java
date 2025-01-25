package com.raz.Java_CH.Class_Object;

public class Car {
    String brand;
    int speed;


    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }


    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

}


