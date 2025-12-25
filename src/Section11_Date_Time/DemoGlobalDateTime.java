package Section11_Date_Time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DemoGlobalDateTime {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("2022-07-20");
        LocalDateTime localDateTime = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant instant = Instant.parse("2022-07-20T01:30:26Z");

        // converting an Instant (UTC) to a LocalDateTime using the system default time zone
        LocalDateTime instantTimeZone = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        // converting an Instant (UTC) to a LocalDateTime using the Portugal time zone
        LocalDateTime instantTimeZonePortugal = LocalDateTime.ofInstant(instant, ZoneId.of("Europe/Lisbon"));

        // ZoneId.of(...) uses IANA time zone IDs
        // Examples: "Europe/Lisbon", "America/Sao_Paulo"


        System.out.println(instantTimeZone);
        System.out.println(instantTimeZonePortugal);

    }
}
