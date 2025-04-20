package chapter07.readOneTimes;

public class Practice7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv7_19());
        b.buy(new Computer7_19());
        b.buy(new Tv7_19());
        b.buy(new Audio7_19());
        b.buy(new Computer7_19());
        b.buy(new Computer7_19());
        b.buy(new Computer7_19());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product7_19[] cart = new Product7_19[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product 배열 cart에 사용될 index

    void buy(Product7_19 p) {
        if (money < p.price) {
            System.out.printf("잔액이 부족하여 %s을/를 살 수 없습니다.%n", p);
            return;
        }

        money -= p.price;
        add(p);
    }

    void add(Product7_19 p) {
        if (i >= cart.length) {
            Product7_19[] newProduct = new Product7_19[cart.length * 2];
            System.arraycopy(cart, 0, newProduct, 0, cart.length);
            cart = newProduct;
        }

        cart[i] = p;
        i++;
    }

    void summary() {
        StringBuffer stringBuffer = new StringBuffer();
        int sum = 0;

        for (int i = 0; i < cart.length; i++) {
            stringBuffer.append(cart[i]).append(",");
            sum += cart[i].price;
        }

        System.out.printf("구입한 물건:%s%n", stringBuffer);
        System.out.printf("사용한 금액:%d%n", sum);
        System.out.printf("남은 금액:%d%n", money);
    }
}

class Product7_19 {
    int price;

    public Product7_19(int price) {
        this.price = price;
    }
}

class Tv7_19 extends Product7_19 {
    public Tv7_19() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer7_19 extends Product7_19 {
    public Computer7_19() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio7_19 extends Product7_19 {
    public Audio7_19() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}