package chapter09.readOneTimes.mathClass;

import java.math.BigInteger;

/*
페이지 520
long 타입으로 팩토리얼 계산하면 20!까지밖에 계산할 수 없지만,
BigInteger 타입으로 팩토리얼 계산 하면 99! 이상 계산 가능하다.
 */
public class BigIntegerEx {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 100; i++) {
            // 1!부터 99!까지 출력
            System.out.printf("%d!=%s%n", i, calcFactorial(i));
            Thread.sleep(300); // 0.3초의 지연
        }
    }

    static String calcFactorial(int n) {
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            // return n * factorial(n-1)
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
