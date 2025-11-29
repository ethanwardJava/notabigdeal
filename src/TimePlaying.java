import java.math.BigInteger;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TimePlaying {
    public static void operate() {
        LocalDate presentDate = LocalDate.now();
        System.out.println(presentDate);
        System.out.println(presentDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        LocalDate birth = LocalDate.of(2001, 4, 17);

        Period age = Period.between(birth, LocalDate.now());
        System.out.printf("You are %d years, %d months, and %d days old.%n",
                age.getYears(), age.getMonths(), age.getDays());


        long daysLived = ChronoUnit.DAYS.between(birth, presentDate);
        System.out.println(daysLived + " Days you have lived");

        LocalTime timeNow = LocalTime.now();
        LocalTime timer = LocalTime.of(23,11); // a sample time
        Duration duration = Duration.between(LocalTime.of(10, 0), LocalTime.of(12, 30));



        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(zdt);

        BigInteger nancy = new BigInteger("12000");
        BigInteger venom = new BigInteger("25000");
        System.out.println(nancy.abs().add(venom));
    }
}
