package chapter07.readOneTimes;

/*
Practice7_22
 */
public class Shape7_22 {
    Point7_22 p;

    public Shape7_22() {
        this(new Point7_22(0, 0));
    }

    public Shape7_22(Point7_22 p) {
        this.p = p;
    }

    public double extent() {
        return 0;
    }
}

class Circle7_22 extends Shape7_22 {
    double r; // 반지름

    public Circle7_22() {
        this(new Point7_22(0, 0), 0);
    }

    public Circle7_22(double r) {
        this.r = r;
    }

    public Circle7_22(Point7_22 p, double r) {
        super(p);
        this.r = r;
    }

    // 원 넓이 구하기
    public double extent() {
        return r * r * Math.PI;
    }
}

class Rectangle7_22 extends Shape7_22 {
    double width; // 폭
    double height; // 높이

    public Rectangle7_22() {
        this(new Point7_22(0, 0), 0, 0);
    }

    public Rectangle7_22(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle7_22(Point7_22 p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    // 정사각형인지 아닌지를 알려준다.
    boolean isSquare() {
        return width == height;
    }

    // 정사각형 넓이 구하기
    public double extent() {
        return width * height;
    }
}

class Point7_22 {
    int x;
    int y;

    public Point7_22() {
        this(0, 0);
    }

    public Point7_22(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + "," + y + "}";
    }
}