package chapter10.readOneTimes.decimalFormat;

import java.text.DecimalFormat;

/*
페이지 543
DecimalFormat
parse 메서드를 이용하면 기호와 문자가 포함된 문자열을 숫자로 쉽게 변환할 수 있다.
 */
public class DecimalFormatEx2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567.89");
            System.out.print("1,234,567.89" + " -> ");

            double d = num.doubleValue();
            System.out.print(d + " -> ");

            System.out.println(df2.format(num));
        } catch (Exception e) {}
    }
}
