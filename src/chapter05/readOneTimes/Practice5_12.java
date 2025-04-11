package chapter05.readOneTimes;

import java.util.Scanner;

public class Practice5_12 {
    public static void main(String[] args) {
        String[][] strArr = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < strArr.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? ", i + 1, strArr[i][0]);
            String input = scanner.nextLine().trim();

            if (input.equals(strArr[i][1])) {
                System.out.printf("정답입니다.%n%n");
                count++;
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", strArr[i][1]);
            }
        }

        System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", strArr.length, count);
    }
}
