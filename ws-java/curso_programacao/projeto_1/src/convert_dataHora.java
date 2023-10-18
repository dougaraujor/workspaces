
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class convert_dataHora {
    public static void main(String[] args) {
        // Mostrando como são realizadas as formatações de data padrão para customizável
        
        LocalDate d04 = LocalDate.parse("2023-10-04");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-04T22:39:55");
        Instant d06 = Instant.parse("2023-10-04T22:39:55Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");     
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault()); 

        System.out.println("d04: " + d04.format(fmt1));
        System.out.println("d05: " + d05.format(fmt2));
        System.out.println("d04: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d06: " + fmt3.format(d06)); 

    }
}
