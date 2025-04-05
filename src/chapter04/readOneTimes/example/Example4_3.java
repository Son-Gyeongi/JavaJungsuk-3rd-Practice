package chapter04.readOneTimes.example;

/*
페이지 170
 */
public class Example4_3 {
    public static void main(String[] args) {
        int j = 11;

        for (int i = 1; i <= 10; i++) ; // 빈 문장 ';'을 10번 반복한다.
        {
            System.out.println("j = " + j); // j = 11 이 출력된다.
        }
    }
}
