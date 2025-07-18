package chapter09.readOneTimes.wrapperEx;

/*
페이지 491
 */
public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i==i2 ? " + (i == i2));
        System.out.println("i.equals(i2) ? " + i.equals(i2));
        System.out.println("i.compareTo(i2) ? " + i.compareTo(i2));
        System.out.println("i.toString() = " + i.toString());

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.SIZE = " + Integer.SIZE + " bits");
        System.out.println("Integer.BYTES = " + Integer.BYTES + " bytes");
        System.out.println("Integer.TYPE = " + Integer.TYPE);
    }
}
