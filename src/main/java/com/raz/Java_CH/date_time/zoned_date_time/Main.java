package com.raz.Java_CH.date_time.zoned_date_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        //   availableZoneIds.forEach(System.out::println);

        ZonedDateTime customZonedDareTime = ZonedDateTime.of(2000, 05, 23, 12, 06, 30, 45, ZoneId.of("America/New_York"));
        System.out.println(customZonedDareTime);

        ZonedDateTime nepalTime = ZonedDateTime.now();
        System.out.println("Current time in Nepal: " +nepalTime);

        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in New York: " + newYorkTime);

        ZoneId zone = nepalTime.getZone();
        System.out.println(zone);

        ZonedDateTime parse = ZonedDateTime.parse("2023-04-23T10:30:00-04:00[America/New_York]");
        System.out.println(parse);

    }
}
