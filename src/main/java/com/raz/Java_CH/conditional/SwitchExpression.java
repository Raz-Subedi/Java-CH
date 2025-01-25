package com.raz.Java_CH.conditional;

public class SwitchExpression {
    public static void main(String[] args) {
        int day = 3;

        String s= switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid Day";
        };

        System.out.println(s);
    }
}
