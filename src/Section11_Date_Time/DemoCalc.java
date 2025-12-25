package Section11_Date_Time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DemoCalc {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        LocalDate yesterday = localDate.minusDays(1);
        System.out.println("Yesterday  " + yesterday);

        LocalDate pastWeek = localDate.minusDays(7);
        System.out.println("past Week " + pastWeek);

        LocalDate nextWeek = localDate.plusDays(7);
        System.out.println("next Week " + nextWeek);

        LocalDateTime pastWeekLocalDateTime = localDateTime.minusDays(7);
        System.out.println("past Week " + pastWeekLocalDateTime);

        LocalDateTime nextYear = localDateTime.plusYears(1);
        System.out.println("next Year " + nextYear);

        Instant pastWeekInstant = instant.minus(7, ChronoUnit.DAYS);
        System.out.println("Instant past week " + pastWeekInstant);

        Instant nextWeekInstant = instant.plus(7, ChronoUnit.DAYS);
        System.out.println("Instant next week " + nextWeekInstant);

        Duration duration1 = Duration.between(pastWeekLocalDateTime, localDateTime);
        System.out.println("Duration between past week and now\"\n: " + duration1.toDays() + " days");

        //Exception: Unsupported unit Seconds
        //Duration duration2 = Duration.between(pastWeek, nextWeek);
        //System.out.println("Duration days " + duration2.toDays() + " days");
        //Duration does not support LocalDate because it has no time component (hours, minutes, seconds)

        // Converting LocalDate to LocalDateTime using atStartOfDay()
        Duration duration2 = Duration.between(pastWeek.atStartOfDay(), nextWeek.atStartOfDay());
        System.out.println("Duration between weeks: " + duration2.toDays() + " days");

        Duration duration3 = Duration.between(instant, nextWeekInstant); //converting to LocalDateTime
        System.out.println("Duration between weeks (instant): " + duration3.toDays() + " days");

    }
}
