package chapter05.readOneTimes;

public class Practice5_11 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        int[][] result = new int[score.length + 1][score[0].length + 1];

        int first = 0, second = 0, third = 0;
        for (int i = 0; i < score.length; i++) {
            int sum = 0;

            for (int j = 0; j < score[i].length; j++) {
                result[i][j] = score[i][j];
                sum += score[i][j];

                if (j + 1 == result[0].length - 1) {
                    result[i][j + 1] = sum;
                }
            }

            first += score[i][0];
            second += score[i][1];
            third += score[i][2];
        }

        result[result.length - 1][0] = first;
        result[result.length - 1][1] = second;
        result[result.length - 1][2] = third;
        result[result.length - 1][3] = first + second + third;

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    }
}
