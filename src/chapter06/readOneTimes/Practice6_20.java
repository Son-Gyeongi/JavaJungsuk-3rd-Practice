package chapter06.readOneTimes;

import java.util.Arrays;

public class Practice6_20 {
    public static int[] shuffle(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);

            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}
