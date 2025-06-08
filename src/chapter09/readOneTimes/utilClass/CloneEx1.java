package chapter09.readOneTimes.utilClass;

/*
페이지 456
 */
class PointC9 implements Cloneable {
    int x, y;

    public PointC9(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone(); // clone() 반드시 예외처리를 해주어야 한다.
        } catch (CloneNotSupportedException e) {}

        return obj;
    }
}

public class CloneEx1 {
    public static void main(String[] args) {
        PointC9 original = new PointC9(3, 5);
        PointC9 copy = (PointC9) original.clone(); // 복제(clone)해서 새로운 객체를 생성
        System.out.println(original);
        System.out.println(copy);
    }
}
