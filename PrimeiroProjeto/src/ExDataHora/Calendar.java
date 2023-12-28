package ExDataHora;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Calendar {
    public static void main(String[] args) {
        
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        Instant d = Instant.parse("2022-07-20T01:30:26Z"); //HORA FORMATADA EM ISO

        System.out.println( sdf.format(d));
    }
}
