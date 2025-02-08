package com.raz.Java_CH.enums;

public class switchCase {

    public enum Months{
        JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
    }

    public static void main(String[] args) {

        Day day = Day.MONDAY;

        switch (day){
            case MONDAY:{
                System.out.println("Today is Monday :");
                break;
            }
            case TUESDAY:{
                System.out.println("Today is Tuesday");
                break;
            }
            default:{
                System.out.println("Weekend !!");
            }
        }


        switch (day){
            case MONDAY -> {
                System.out.println("M");
            }
            case TUESDAY -> {
                System.out.println("T");
            }
        }


        String res = switch (day){
            case MONDAY -> "M";
            case TUESDAY -> "T";
            default -> "Weekend";
        };
        System.out.println(res);

        System.out.println(Months.JANUARY);





    }
}
