package com.raz.Java_CH.date_time.formatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.now();
       // System.out.println(now);

        LocalDate parse = LocalDate.parse("2025-02-06");
        System.out.println(parse);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = localDate.format(myFormatter);
        System.out.println(format);

        String date = "25/04/1998";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse1 = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(parse1);

        String dateTimeString = "2023-04-24 10:30:45+05:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
        ZonedDateTime parse2 = ZonedDateTime.parse(dateTimeString,formatter);
        System.out.println(parse2);
    }
}
