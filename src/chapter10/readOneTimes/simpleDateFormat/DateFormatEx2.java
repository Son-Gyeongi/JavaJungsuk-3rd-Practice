package chapter10.readOneTimes.simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
페이지 546
Calendar 인스턴스를 Date 인스턴스로 변환
 */
public class DateFormatEx2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2025, 9, 3); // 2025년 10월 3일 - Month는 0~11의 범위를 갖는다.

        Date day = cal.getTime(); // Calendar를 Date로 변환

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        // Date 인스턴스만 format 메서드에 사용 가능
        System.out.println(sdf1.format(day));
        System.out.println(sdf2.format(day));
        System.out.println(sdf3.format(day));
        System.out.println(sdf4.format(day));
    }
}
