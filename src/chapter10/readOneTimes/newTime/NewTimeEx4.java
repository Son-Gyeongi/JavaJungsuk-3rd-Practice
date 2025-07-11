package chapter10.readOneTimes.newTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

/*
페이지 571
Period 날짜 차이 계산
Duration 시간 차이 계산
 */
public class NewTimeEx4 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024, 1, 1);
        LocalDate date2 = LocalDate.of(2025, 12, 31);

        Period pe = Period.between(date1, date2);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("pe = " + pe);

        System.out.println("YEAR = " + pe.get(ChronoUnit.YEARS));
        System.out.println("MONTH = " + pe.get(ChronoUnit.MONTHS));
        System.out.println("DAY = " + pe.get(ChronoUnit.DAYS));

        LocalTime time1 = LocalTime.of(0, 0, 0);
        LocalTime time2 = LocalTime.of(12, 34, 56); // 12시간 34분 56초

        Duration du = Duration.between(time1, time2);

        System.out.println("time1 = " + time1);
        System.out.println("time2 = " + time2);
        System.out.println("du = " + du);

        LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());

        System.out.println("HOUR = " + tmpTime.getHour());
        System.out.println("MINUTE = " + tmpTime.getMinute());
        System.out.println("Second = " + tmpTime.getSecond());
        System.out.println("Nano = " + tmpTime.getNano());
    }
}
