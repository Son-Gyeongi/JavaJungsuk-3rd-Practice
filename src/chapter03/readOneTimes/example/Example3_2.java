package chapter03.readOneTimes.example;

/*
페이지 97, 98
정수형인 경우, 나누는 수로 0을 사용할 수 없다.
실수형인 경우, 나누는 수로 0.0f 를 사용하면 Infinity 무한대의 결과가 나온다.
 */
public class Example3_2 {
    public static void main(String[] args) {
        float avg = 3 / 0.0f;
        System.out.println("avg = " + avg);
    }
}
