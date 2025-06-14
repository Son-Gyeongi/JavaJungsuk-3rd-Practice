package chapter09.readOneTimes.question;

/*
페이지 470
String 클래스 toString() 메서드
 */
public class QToString {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = s.toString();
        String s2 = s; // s.toString(); 같음

        System.out.println("s == s1 => " + (s == s1));
        System.out.println("s1 = " + s1);

        System.out.println("s == s2 => " + (s == s2));
        System.out.println("s2 = " + s2);

        System.out.println("s.hashCode() = " + s.hashCode());
        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("s2.hashCode() = " + s2.hashCode());

        System.out.println("System.identityHashCode(s) = " + System.identityHashCode(s));
        System.out.println("System.identityHashCode(s1) = " + System.identityHashCode(s1));
        System.out.println("System.identityHashCode(s2) = " + System.identityHashCode(s2));
    }
}
