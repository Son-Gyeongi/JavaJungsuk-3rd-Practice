package chapter09.readOneTimes.stringTokenizerClass;

import java.util.StringTokenizer;

/*
페이지 514
 */
public class StringTokenizerEx1 {
    public static void main(String[] args) {
        String source = "100,200,300,400";
        StringTokenizer st = new StringTokenizer(source, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
