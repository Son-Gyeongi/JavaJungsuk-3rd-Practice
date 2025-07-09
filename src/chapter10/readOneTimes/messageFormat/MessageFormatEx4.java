package chapter10.readOneTimes.messageFormat;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

/*
페이지 551
Scanner 를 통해 파일로부터 데이터를 라인별로 읽어서 처리
- 이렇게 파일로부터 데이터를 제공받으면 데이터가 변경되어도 다시 컴파일을 하지 않아도 된다.
 */
public class MessageFormatEx4 {
    public static void main(String[] args) throws Exception { // ParseException, FileNotFoundException
        String tableName = "CUST_INFO";
        String fileName = "C:\\cheerup\\JavaJungsuk-3rd-Practice\\src\\chapter10\\readOneTimes\\messageFormat\\data4.txt"; // "data4.txt"
        String msg = "INSERT INTO " + tableName + " VALUES ({0},{1},{2},{3});"; // '는 escape 문자로 연속 두번 사용
        Scanner s = new Scanner(new File(fileName));

        String pattern = "{0},{1},{2},{3}";
        MessageFormat mf = new MessageFormat(pattern);

        while (s.hasNextLine()) {
            String line = s.nextLine();
            Object[] objs = mf.parse(line);
            System.out.println(MessageFormat.format(msg, objs));
        }

        s.close(); // 작업이 끝났으니 Scanner 에서 사용한 파일을 닫아 준다.
    }
}
