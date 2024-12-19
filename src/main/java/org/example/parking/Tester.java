package org.example.parking;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {

    public static void main(String[] args) {

        LocalDateTime enter = LocalDateTime.of(2024, 1, 12,
                8, 0, 0);
        LocalDateTime leave = LocalDateTime.of(2024, 1, 12,
                12, 4, 0);
        Car car = new Car("AA-7777", enter);
        car.setLeaveTime(leave);
        System.out.println(car.getDuration());
        long hours = (long) Math.ceil(car.getDuration() / 60.0);
        System.out.println(hours);
        System.out.println("Parking fee =" + hours * 30);



    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other = LocalDateTime.of(2024, 11, 11, 12, 0, 0);
        System.out.println(other);
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        String s = "2021-12-12 12:00:00";
        Date otherDate = null;
        try {
            otherDate = sdf.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(otherDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 0);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,50);
        System.out.println(calendar.getTime());
    }
}
