package chapter10.readOneTimes.choiceFormat;

import java.text.ChoiceFormat;

/*
페이지 548
특정 범위에 속하는 값을 문자열로 반환해준다.
 */
public class ChoiceFormatEx1 {
    public static void main(String[] args) {
        double[] limits = {60, 70, 80, 90}; // 낮은 값부터 큰 값의 순서로 적어야 한다.
        // limits, grades 간의 순서와 개수를 맞추어야 한다.
        String[] grades = {"D", "C", "B", "A"};

        int[] scores = {100, 95, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + ":" + form.format(scores[i]));
        }
    }
}
