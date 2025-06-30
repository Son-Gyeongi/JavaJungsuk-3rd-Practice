package chapter10.readOneTimes.calendar;

import java.util.Calendar;

/*
페이지 534
Calendar 클래스에 roll() 메서드는 해당 자리만 날짜가 바뀌지만
'월' 기준으로 '일'이 맞지 않다면 '일'도 바뀜
 */
public class CalendarEx5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2025, 0, 31); // 2025년 1월 31일
        System.out.println(toString(date));
        date.roll(Calendar.MONTH, 1);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 "
                + date.get(Calendar.DATE) + "일";
    }
}
