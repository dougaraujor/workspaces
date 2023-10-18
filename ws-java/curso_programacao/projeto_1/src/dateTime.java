
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class dateTime {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2023-10-04");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-04T22:39:55");
        Instant d06 = Instant.parse("2023-10-04T22:39:55Z");
        Instant d07 = Instant.parse("2023-10-04T22:39:55-03:00");
        LocalDate d08 = LocalDate.parse("04/10/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("04/10/2023 22:47", fmt2);
        LocalDate d10 = LocalDate.of(2023, 10, 04);
        LocalDateTime d11 = LocalDateTime.of(2023, 10, 04, 22, 53);

        System.out.println(d01.toString()); // Horário atual dependendo do Locale.
        System.out.println(d02.toString()); // Horário atual com dia,mes,ano, e tempo com microssegundos
        System.out.println(d03.toString()); // Horario atual com dia,mes, ano e tempo com microssegundos na TimeZone
                                            // Zulu
        // (Londres)]
        System.out.println(d04.toString()); // Objeto criado com DateTime dependendo do locale
        System.out.println(d05.toString()); // Objeto criado com DateTime com ano,mes,dia e tempo atual dependendo do
                                            // Locale
        System.out.println(d06.toString()); // Objeto criado com Tempo atual dependendo do Zulu
        System.out.println(d07.toString()); // Objeto criado com tempo atual do Zulu baseado na timezone de SP -03:00
        System.out.println(d08.toString()); // Horário com valor customizável
        System.out.println(d09.toString()); // Horario com valor customizável com dia,mes,ano e hora.
        System.out.println(d10.toString()); //
        System.out.println(d11.toString());

    }
}
