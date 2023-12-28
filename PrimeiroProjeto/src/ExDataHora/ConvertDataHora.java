package ExDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * ConvertDataHora
 */
public class ConvertDataHora {

    public static void main(String[] args) {
        LocalDate f04 = LocalDate.parse("2022-07-20");
        LocalDateTime f05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant f06 = Instant.parse("2022-07-20T01:30:26Z");

        // imprime todas zone ID
        // for(String s : ZoneId.getAvailableZoneIds()){
        // System.out.println(s); }

        LocalDate r1 = LocalDate.ofInstant(f06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(f06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(f06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(f06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d04 dia: " + f04.getDayOfMonth());
        System.out.println("d04 mes: " + f04.getMonthValue());
        System.out.println("d04 ano: " + f04.getYear());

        System.out.println("d05 hora: " + f05.getHour());
        System.out.println("d05 minuto: " + f05.getMinute());
        System.out.println("d05 segundo: " + f05.getSecond());
    }
}