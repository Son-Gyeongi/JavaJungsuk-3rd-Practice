package chapter09.readOneTimes.stringbufferClass;

/*
페이지 479
StringBuffer 의 비교
 */
public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

        // StringBuffer 의 내용을 String 으로 변환한다.
        String s = sb.toString(); // String s = new String(sb);와 같다.
        String s2 = sb2.toString();

        System.out.println("s.equals(s2) ? " + s.equals(s2));
    }
}
