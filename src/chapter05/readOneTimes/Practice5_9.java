package chapter05.readOneTimes;

public class Practice5_9 {
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

        int y = 0;
        for (int i = 0; i < star.length; i++) {
            int x = star.length - 1;
            y = star[i].length - 1;
            for (int j = 0; j < star[i].length; j++) {
                result[j][i] = star[x][y];
                x--;
            }
            --y;
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
