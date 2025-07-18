package chapter09.readOneTimes.math;

/*
페이지 483
Math 클래스
 */
public class MathEx1 {
    public static void main(String[] args) {
        double val = 90.7552;
        System.out.println("Math.round(" + val + ") = "  + Math.round(val)); // 반올림

        val *= 100;
        System.out.println("Math.round(" + val + ") = "  + Math.round(val)); // 반올림

        System.out.println("Math.round(" + val + ") / 100 = " + Math.round(val) / 100); // 반올림
        System.out.println("Math.round(" + val + ") / 100.0 = " + Math.round(val) / 100.0); // 반올림
        System.out.println();
        System.out.printf("ceil(%3.1f)=%3.1f%n", 1.1, Math.ceil(1.1)); // 올림
        System.out.printf("floor(%3.1f)=%3.1f%n", 1.5, Math.floor(1.5)); // 버림
        System.out.printf("round(%3.1f)=%d%n", 1.1, Math.round(1.1)); // 반올림
        System.out.printf("round(%3.1f)=%d%n", 1.5, Math.round(1.5)); // 반올림
        System.out.printf("rint(%3.1f)=%f%n", 1.5, Math.rint(1.5)); // 반올림
        System.out.printf("round(%3.1f)=%d%n", -1.5, Math.round(-1.5)); // 반올림
        System.out.printf("rint(%3.1f)=%f%n", -1.5, Math.rint(-1.5)); // 반올림
        System.out.printf("ceil(%3.1f)=%f%n", -1.5, Math.ceil(-1.5)); // 올림
        System.out.printf("floor(%3.1f)=%f%n", -1.5, Math.floor(-1.5)); // 버림
    }
}
