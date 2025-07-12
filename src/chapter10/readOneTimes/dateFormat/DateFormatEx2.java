package chapter10.readOneTimes.dateFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
페이지 575
문자열을 날짜와 시간으로 파싱하기
 */
public class DateFormatEx2 {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.parse("2025-01-01", DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate date = LocalDate.parse("2001-01-01");
        LocalTime time = LocalTime.parse("23:59:59");
        LocalDateTime dateTime = LocalDateTime.parse("2001-01-01T23:59:59");

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime endOfYear = LocalDateTime.parse("2025-12-31 23:59:59", pattern);

        System.out.println("newYear = " + newYear);
        System.out.println("date = " + date);
        System.out.println("time = " + time);
        System.out.println("dateTime = " + dateTime);
        System.out.println("endOfYear = " + endOfYear);
    }
}
