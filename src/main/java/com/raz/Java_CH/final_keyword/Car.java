package com.raz.Java_CH.final_keyword;

import com.raz.Java_CH.abstraction.Vehicle;

public final class Car extends Vehicle {

    private final int speedLimit;

    public Car(){
        speedLimit = 200;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

    public final void airBags(){
        System.out.println("4 Air bags");
    }
}
