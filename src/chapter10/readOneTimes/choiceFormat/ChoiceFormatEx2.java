package chapter10.readOneTimes.choiceFormat;

import java.text.ChoiceFormat;

/*
페이지 548
 */
public class ChoiceFormatEx2 {
    public static void main(String[] args) {
        String pattern = "60#D|70#C|80<B|90#A"; // 패턴 구분자 '#':경계값을 범위에 포함, '<':경계값을 범위에 포함하지 않음
        int[] scores = {91, 90, 80, 88, 70, 52, 60};

        ChoiceFormat form = new ChoiceFormat(pattern);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + ":" + form.format(scores[i]));
        }
    }
}
