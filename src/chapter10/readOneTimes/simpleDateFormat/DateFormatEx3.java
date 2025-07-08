package chapter10.readOneTimes.simpleDateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
페이지 546
parse(String source)를 사용하여 날짜 데이터의 출력형식을 변환하는 방법을 보여주는 예제
 */
public class DateFormatEx3 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2025년 11월 23일");
            System.out.println(df2.format(d));
        } catch (Exception e) {}
    }
}
