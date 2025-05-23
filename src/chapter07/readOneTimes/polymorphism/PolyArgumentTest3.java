package chapter07.readOneTimes.polymorphism;

import java.util.ArrayList;
import java.util.List;

/*
페이지 373
 */
class Product3 {
    int price; // 제품의 가격
    int bonusPoint; // 제품 구매 시 제공하는 보너스 점수

    public Product3(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0); // 보너스 점수는 제품 가격의 10%
    }

    public Product3() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv3 extends Product3 {
    public Tv3() {
        // 조상 클래스의 생성자 Product3(int price)를 호출한다.
        super(100); // Tv3의 가격을 100만원으로 한다.
    }

    // Object 클래스의 toString() 을 오버라이딩한다.
    @Override
    public String toString() {
        return "Tv3";
    }
}

class Computer3 extends Product3 {
    public Computer3() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer3";
    }
}

class Audio3 extends Product3 {
    public Audio3() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio3";
    }
}

class Buyer3 { // 고객, 물건을 사는 사람
    int money = 1000; // 소유금액
    int bonusPoint = 0; // 보너스 점수
    List<Product3> item = new ArrayList<>(); // 구입한 제품을 저장하는데 사용될 List

    void buy(Product3 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
        item.add(p); // 구입한 제품을 List 에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void refund(Product3 p) { // 구입한 제품을 환불한다.
        if (item.remove(p)) { // 제품을 List 에서 제거한다.
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 구입하셨습니다.");
        } else { // 제거에 실패한 경우
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() { // 구매한 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0; // 구입한 물품의 가격합계
        String itemList = ""; // 구입한 물품목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < item.size(); i++) {
            Product3 p = item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        Tv3 tv = new Tv3();
        Computer3 com = new Computer3();
        Audio3 audio = new Audio3();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}
