package chapter09.readOneTimes.utilClass;

import java.util.Arrays;

/*
페이지 458
 */
public class CloneEx2 {
    public static void main(String[] args) {
        // 기본 타입 배열 - 깊은 복사, 참조 타입 배열 - 얕은 복사
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone(); // 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
        arrClone[0] = 6; // 수정해도 원본 영향 없음
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));

        int[] arrClone2 = new int[arr.length];
        System.arraycopy(arr, 0, arrClone2, 0, arr.length);
        arrClone2[0] = 5;
        System.out.println(Arrays.toString(arrClone2));
    }
}
