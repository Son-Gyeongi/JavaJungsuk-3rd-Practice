package chapter09.readOneTimes.utilClass;

/*
페이지 460
 */
class CircleC9Shallow implements Cloneable {
    PointC9Shallow p; // 원점
    double r; // 반지름

    public CircleC9Shallow(PointC9Shallow p, double r) {
        this.p = p;
        this.r = r;
    }

    public CircleC9Shallow shallowCopy() {
        // 얕은 복사

        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}

        return (CircleC9Shallow) obj;
    }

    public CircleC9Shallow deepCopy() {
        // 깊은 복사

        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}

        CircleC9Shallow c = (CircleC9Shallow) obj;
        c.p = new PointC9Shallow(this.p.x, this.p.y); // 객체 복사

        return c;
    }

    @Override
    public String toString() {
        return "[p="+p+", r="+r + "]";
    }
}

class PointC9Shallow {
    int x, y;

    public PointC9Shallow(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        CircleC9Shallow c1 = new CircleC9Shallow(new PointC9Shallow(1, 1), 2.0);
        CircleC9Shallow c2 = c1.shallowCopy(); // 얕은 복사
        CircleC9Shallow c3 = c1.deepCopy(); // 깊은 복사

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println("= c1의 변경 후 =");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
