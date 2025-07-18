package chapter09.readOneTimes.stringClass;

/*
페이지 475
String 을 기본형 값으로 변환
 */
public class StringEx6 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal); // int 를 String 으로 변환한다.

        double dVal = 200.0;
        String strVal2 = dVal + ""; // String 으로 변환하는 또 다른 방법

        double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
        double sum2 = Integer.valueOf("+" + strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
        System.out.println(strVal + "+" + strVal2 + "=" + sum2);
    }
}
