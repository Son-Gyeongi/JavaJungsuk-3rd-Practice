package chapter09.readOneTimes.stringClass;

import java.util.StringJoiner;

/*
페이지 472
String 클래스의 join()과 StringJoiner
 */
public class StringEx4 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/", "[", "]");
        for (String s : arr) {
            sj.add(s);
        }

        System.out.println(sj.toString());
    }
}
