package chapter10.readOneTimes.simpleDateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
페이지 547
화면으로부터 날짜를 입력받아서 계산결과를 출력하는 예제
 */
public class DateFormatEx4 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner s = new Scanner(System.in);

        Date inDate = null;

        System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예:2025/12/31)");
        while (s.hasNextLine()) {
            try {
                inDate = df.parse(s.nextLine());
                break; // 올바르게 입력한 경우
            } catch (Exception e) {
                // 지정된 패턴으로 입력되지 않은 경우 ParseException 예외 발생
                System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력예:2025/12/31)");
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
        System.out.println("입력하신 날짜의 현재와 " + day + "시간 차이가 있습니다.");
    }
}
