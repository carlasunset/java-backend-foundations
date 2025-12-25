package Section11_Date_Time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

// Demonstrates how to format LocalDate, LocalDateTime and Instant using DateTimeFormatter
// Shows custom patterns, ISO formatter and timezone handling for Instant

public class DemoString {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("2022-07-20");
        LocalDateTime localDateTime = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant instant = Instant.parse("2022-07-20T01:30:26Z");

        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter instantFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formatterInstant = DateTimeFormatter.ISO_INSTANT;

        //3 different ways to use the DateTimeFormatter
        System.out.println("localDate = " + localDate.format(localDateFormatter));
        System.out.println("localDate = " + localDateFormatter.format(localDate));
        System.out.println("localDate = " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("localDateTime = " + localDateTime.format(localDateTimeFormatter));

        System.out.println("instant = " + instantFormatter.format(instant));

        System.out.println("instant = " + formatterInstant.format(instant));

    }
}
