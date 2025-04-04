package chapter04.readOneTimes.example;

/*
페이지 165
 */
public class Example4_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5) {
                    System.out.print("*****");
                } else if (j == 1) {
                    System.out.printf("%-5c", '*');
                } else if (j == 5) {
                    System.out.printf("%5c", '*');
                } else {
                    System.out.printf("%5c", ' ');
                }
            }

            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j == 6) {
                    System.out.print("*****");
                } else {
                    System.out.printf("%5c", ' ');
                }
            }

            System.out.println();
        }
    }
}
