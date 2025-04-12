package chapter05.readOneTimes;

/*
코딩을 하기 전에 종이에 그림을 그리고 로직을 정리하는 것은
모니터를 보는 시간을 줄여서 눈의 피로를 적게 하고,
논리적 오류를 줄여줄 수 있다는 장점이 있다.
 */
public class Practice5_9_Answer {
    public static void main(String[] args) {
        char[][] star = {
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'},
        };

        char[][] result = new char[star[0].length][star.length];

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                int x = j;
                int y = star.length - 1 - i; // i + y 는 star.length-1로 일정하다.

                result[x][y] = star[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
