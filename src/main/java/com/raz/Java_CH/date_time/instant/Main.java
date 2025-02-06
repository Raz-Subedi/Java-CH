package com.raz.Java_CH.date_time.instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l); // Gives in millisecond

        Instant now = Instant.now();
        System.out.println(now);   // gives in nano second

        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Asia/Kathmandu"));
        System.out.println(zonedDateTime);

        // Other operations that we can perform:-
        // isBefore isAfter plus minus


    }
}
