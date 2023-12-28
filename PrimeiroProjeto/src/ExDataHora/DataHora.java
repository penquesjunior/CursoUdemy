package ExDataHora;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
  public static void main(String[] args) {

       // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

       DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

       LocalDate d01 = LocalDate.now(); // data local
        LocalDateTime d02 = LocalDateTime.now(); // data e hora local
        Instant d03 = Instant.now(); // data hora global

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

   //     Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2023, 12, 26, 9, 27, 50);

        System.out.println("DATA " + d01);
        System.out.println("data / time: " + d02);
        System.out.println("INSTANT: " + d03); // o Z NO FINAL INDICA GMT
        System.out.println("DATA FORMATADA " + d04);
        System.out.println("DATA FORMATADA E HORA: " + d05);
        System.out.println("INSTANT FORMAT:" + d06);
      //  System.out.println("INSTANT FORMAT LOCAL:" + d07);
        System.out.println("d8:" + d08);
        System.out.println("D09 " + d09);
        System.out.println("D10 " + d10);
        System.out.println("D11 " + d11);

    }
}
