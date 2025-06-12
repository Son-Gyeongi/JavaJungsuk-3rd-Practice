package chapter09.readOneTimes.stringClass;

/*
페이지 468
 */
public class EmptyString {
    public static void main(String[] args) {
        // 길이가 0인 배열을 생성한다.
        char[] cArr = new char[0];// char[] cArr = {};와 같다.
        String s = new String(cArr);// String s= new String(""); 와 같다.

        System.out.println("cArr.length = " + cArr.length);
        System.out.println("@@@" + s + "@@@");
    }
}
