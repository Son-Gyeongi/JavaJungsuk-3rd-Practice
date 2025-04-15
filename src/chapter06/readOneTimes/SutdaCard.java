package chapter06.readOneTimes;

public class SutdaCard {
    int num; // 카드의 숫자(1~10사이의 정수)
    boolean isKwang; // 광이면 true, 아니면 false

    public SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info() {
        return num + (isKwang ? "K" : "");
    }
}
