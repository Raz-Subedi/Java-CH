package com.raz.Java_CH.date_time.local_date;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate customDate = LocalDate.of(1990,2,7);

        int dayOfMonth = now.getDayOfMonth();
        int month = now.getMonthValue();
        int year = now.getYear();

        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);
        LocalDate pastDate = today.minusMonths(100);
        System.out.println(pastDate);

        if(today.isAfter(yesterday)){
            System.out.println("yes it is");
        }

    }
}
