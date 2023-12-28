package ExDataHora;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraFormat {
    public static void main(String[] args) {
        LocalDate f04 = LocalDate.parse("2022-07-20");
        LocalDateTime f05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant f06 = Instant.parse("2022-07-20T01:30:26Z");

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm ").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("f04 : " + f04.format(fmt1));
        System.out.println("f04 : " + fmt1.format(f04));
        System.out.println("f04 : " + f04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("------------");
        System.out.println("f05: " + f05.format(fmt2));
        System.out.println("f05: " + f05.format(fmt1));
        System.out.println("f05: " + f05.format(fmt4));
        System.out.println("------------");
        System.out.println("do6: " + fmt3.format(f06));
        System.out.println("do6: " + fmt5.format(f06));
    }
}
