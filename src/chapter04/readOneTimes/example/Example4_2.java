package chapter04.readOneTimes.example;

/*
페이지 169
 */
public class Example4_2 {
    public static void main(String[] args) {
        int i = 5;

        while (i-- != 0) {
            System.out.println(i);
        }

        i = 5;

        while (--i != 0) {
            System.out.println(i);
        }
    }
}
