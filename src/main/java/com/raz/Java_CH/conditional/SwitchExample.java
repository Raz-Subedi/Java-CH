package com.raz.Java_CH.conditional;

public class SwitchExample {
    public static void main(String[] args) {

        int day = 4;

        switch (day){
            case 1:
                System.out.println("Sunday");
                return;
            case 2:
                System.out.println("Monday");
                return;
            case 3:
                System.out.println("Tuesday");
                return;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("No Day");
        }

        System.out.println("asd");
    }
}
