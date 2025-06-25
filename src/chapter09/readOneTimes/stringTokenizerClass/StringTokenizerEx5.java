package chapter09.readOneTimes.stringTokenizerClass;

import java.util.StringTokenizer;

/*
페이지 517
 */
public class StringTokenizerEx5 {
    public static void main(String[] args) {
        String data = "100,,,200,300";

        String[] result = data.split(",");
        StringTokenizer st = new StringTokenizer(data, ",");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+"|");
        }
        // 빈 문자열도 토큰으로 인식한다.
        System.out.println("개수:" + result.length + " <- split()");

        int i = 0;
        for (; st.hasMoreTokens(); i++) {
            System.out.print(st.nextToken() + "|");
        }
        // 빈 문자열을 토큰으로 인식하지 않는다.
        System.out.println("개수:" + i + " <- StringTokenizer");
    }
}
