package com.raz.Java_CH.enums;

public enum Day {

    // is a relationship
    // These are all the final instance of Day

    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String lower;

    public String getLower() {
        return lower;
    }

    private Day(String lower){
        System.out.println("Our Constructor Called");
        this.lower = lower;
    }

    public void display(){
        System.out.println("Today is " +this.name());
    }
}
