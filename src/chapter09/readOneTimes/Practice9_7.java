package chapter09.readOneTimes;

/*
연습문제 페이지 77
- 첫 번째 문자열(src)에 두 번째 문자열(target)이 포함되어 있는지 확인한다.
- 포함되어 있으면 true, 그렇지 않으면 false를 반환한다.
 */
public class Practice9_7 {
    public static boolean contains(String src, String target) {
        return src.indexOf(target) != -1; // src.contains(target)
    }

    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }
}
