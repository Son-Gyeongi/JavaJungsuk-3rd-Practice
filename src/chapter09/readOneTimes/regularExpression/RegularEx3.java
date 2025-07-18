package chapter09.readOneTimes.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
페이지 506
정규식(Regular Expression)
 */
public class RegularEx3 {
    public static void main(String[] args) {
        String source = "HP:011-1111-1111, HOME:02-999-9999";
        String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(source);

        int i = 0;
        while (m.find()) {
            System.out.println(++i + ": " + m.group() + " -> " + m.group(1) + ", " + m.group(2) + ", " + m.group(3));
        }
    }
}
