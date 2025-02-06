package com.raz.Java_CH.date_time.local_date_time;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime customDateTime = LocalDateTime.of(2025, 05, 06, 12, 58, 20);
        System.out.println(customDateTime);

        LocalDateTime str = LocalDateTime.parse("2023-01-11T13:48");
        System.out.println(str);


    }
}
