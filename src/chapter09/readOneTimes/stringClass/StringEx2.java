package chapter09.readOneTimes.stringClass;

/*
페이지 466
-> "AAA"를 담고 있는 String 인스턴스가 하나 생성된 후,
참조변수 s1, s2, s3 은 모두 이 인스턴스를 참조하게 된다.
 */
public class StringEx2 {
    public static void main(String[] args) {
        String s1 = "AAA";
        String s2 = "AAA";
        String s3 = "AAA";
        String s4 = "BBB";
    }
}
