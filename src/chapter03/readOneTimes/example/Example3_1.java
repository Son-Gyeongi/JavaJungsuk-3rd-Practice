package chapter03.readOneTimes.example;

/*
페이지 95
식에 두 번 이상 포함된 변수에 증감연산자를 사용하는 것은 피해야 한다.
 */
public class Example3_1 {
    public static void main(String[] args) {
        int x = 5;
        x = x++ - ++x;

        System.out.println("x = " + x);
    }
}
