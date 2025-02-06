package com.raz.Java_CH.date_time.duration;

import org.springframework.cglib.core.Local;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

    // Duration is used when we need seconds, minute, hours.
    public static void main(String[] args) throws InterruptedException {

        Instant start = Instant.now();

        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i + 1;
        }
        Instant end = Instant.now();
        Duration d1 = Duration.between(start, end);
        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d1);
        System.out.println(d2);

        int i = d1.compareTo(d2);
        System.out.println(i);

        LocalDateTime a = LocalDateTime.now();
        Thread.sleep(3000);
        LocalDateTime b = LocalDateTime.now();
        Duration between = Duration.between(a, b);
        System.out.println(between);
    }
}
