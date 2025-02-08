package com.raz.Java_CH.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(Day.TUESDAY);
        System.out.println(Day.MONDAY);
        System.out.println(Day.SATURDAY);
        System.out.println(Day.FRIDAY);


        Day monday = Day.MONDAY;
        int ordinal = monday.ordinal();
        System.out.println(ordinal);

        System.out.println(monday.name());

        Day enumDay = Day.valueOf("MONDAY");
        System.out.println(enumDay);

        Day[] values = Day.values();

        for (Day i : values){
            System.out.println(i);
        }

        monday.display();

        System.out.println(monday.getLower());
    }
}
