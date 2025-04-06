package chapter04.readOneTimes;

public class Practice4_4 {
    public static void main(String[] args) {
        int i, j, sum = 0;

        for (i = 0, j = 1; sum < 100; j = -j) {
            i++;
            sum += i * j;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
