import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class calc_data_hora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        LocalDate d04 = LocalDate.parse("2023-10-16");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-16T19:17:20");
        Instant d06 = Instant.parse("2023-10-16T19:17:20Z");
        System.out.println("d05" + d05);
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
    }
}
