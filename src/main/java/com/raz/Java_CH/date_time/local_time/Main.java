package com.raz.Java_CH.date_time.local_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime customTime = LocalTime.of(14, 30, 30);
        System.out.println(customTime);

        String timeInString = "15:30:45";
        LocalTime parseTime = LocalTime.parse(timeInString);
        System.out.println(parseTime);

        LocalTime beforeOneHour = now.minusHours(1);
        System.out.println(beforeOneHour);

        if(now.isAfter(beforeOneHour)){
            System.out.println("Yes Yesss");
        }

    }
}
