package chapter03.readOneTimes;

public class Practice3_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);

        char ch = 'A';
        ch = (char) (ch + 2);

        float f = 3f / 2;
        long l = 3000L * 3000 * 3000;

        float f2 = 0.1f;
        double d = f2;

        boolean result = d == f2;

        System.out.println("c = " + c);
        System.out.println("ch = " + ch);
        System.out.println("f = " + f);
        System.out.println("l = " + l);
        System.out.println("result = " + result);
    }
}
