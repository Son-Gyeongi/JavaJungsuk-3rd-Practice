package chapter04.readOneTimes;

public class Practice4_15 {
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;

        int result; // 변수 number 를 거꾸로 변환해서 담을 변수

        String str = "";
        while (tmp != 0) {
            str += tmp % 10;
            tmp /= 10;
        }
        result = Integer.parseInt(str);

        if (number == result) {
            System.out.println(number + "는 회문수 입니다.");
        } else {
            System.out.println(number + "는 회문수가 아닙니다.");
        }
    }
}
