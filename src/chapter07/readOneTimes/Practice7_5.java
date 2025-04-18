package chapter07.readOneTimes;

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스 점수

    /*public Product() {
    }*/

    public Product(int price, int bonusPoint) {
        this.price = price;
        this.bonusPoint = bonusPoint;
    }
}

class Tv extends Product {
    public Tv() {
        // super(); 컴파일러가 자동으로 추가해준다.
        // 또는
        super(100, 10);
    }

    public Tv(int price, int bonusPoint) {
        super(price, bonusPoint);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

public class Practice7_5 {
    public static void main(String[] args) {
        Tv tv = new Tv();
    }
}
