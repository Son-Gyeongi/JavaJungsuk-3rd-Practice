package chapter10.readOneTimes.messageFormat;

import java.text.MessageFormat;

/*
페이지 550
반복문으로 하나 이상의 데이터 집합을 출력하는 예제
다수의 Database 에 저장하기 위한 Insert 문으로 변환하는 경우 등에 사용
 */
public class MessageFormatEx2 {
    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',''{2}'',''{3}'');"; // '는 escape 문자로 연속 두번 사용

        Object[][] arguments = {
                {"이자바", "02-123-1234", "27", "07-09"},
                {"김프로", "032-333-1234", "33", "10-07"},
        };

        for (int i = 0; i < arguments.length; i++) {
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }
    }
}
