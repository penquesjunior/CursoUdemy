package ExDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TempEntreDataHora {
    public static void main(String[] args) {
        LocalDate f04 = LocalDate.parse("2022-07-20");
        LocalDateTime f05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant f06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = f04.minusDays(20);
        LocalDate plusDaysLocalDate = f04.plusDays(20);

        System.out.println("lastWeek: " + pastWeekLocalDate);
        System.out.println("next week: " + plusDaysLocalDate);

        LocalDateTime pastWeekLocalDateTime = f05.minusHours(7);
        LocalDateTime plusDaysLocalDateTime = f05.plusHours(10);

        System.out.println("\nlastWeekTime: " + pastWeekLocalDateTime);
        System.out.println("next week Time: " + plusDaysLocalDateTime);

        Instant pastWeekInstant = f06.minus(7, ChronoUnit.DAYS);
        Instant plusDaysInstant = f06.plus(7, ChronoUnit.DAYS);

        System.out.println("\nlast Week Instant: " + pastWeekInstant);
        System.out.println("next week Instant: " + plusDaysInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, f05);
        Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), f04.atTime(0, 0));
        Duration t3 = Duration.between(pastWeekInstant, plusDaysInstant);
        Duration t4 = Duration.between(plusDaysInstant, pastWeekInstant);

        System.out.println("\ntempo entre eles: " + t1.toHours());
        System.out.println("t2 tempo entre : " + t2.toDays());
        System.out.println("t3 tempo entre : " + t3.toDays());
        System.out.println("t4 tempo entre : " + t4.toDays());
    }
}
