package chapter09.readOneTimes.stringTokenizerClass;

import java.util.StringTokenizer;

/*
페이지 515
 */
public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
