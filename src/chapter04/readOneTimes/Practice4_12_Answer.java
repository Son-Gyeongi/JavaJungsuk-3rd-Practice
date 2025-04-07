package chapter04.readOneTimes;

public class Practice4_12_Answer {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                int x = j + 1 + (i - 1) / 3 * 3;
                int y = i % 3 == 0 ? 3 : i % 3;

                if (x > 9) { // 9단까지만 출력, 해당 코드 없으면 10단이 출력된다.
                    break;
                }

                System.out.printf("%d*%d=%d\t", x, y, x * y);
            }

            System.out.println();
            if (i % 3 == 0 && i < 9) {
                System.out.println();
            }
        }
    }
}
