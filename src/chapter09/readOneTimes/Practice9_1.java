package chapter09.readOneTimes;

public class Practice9_1 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1.equals(c2) = " + c1.equals(c2));
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SutdaCard sc) {
            return num == sc.num && isKwang == sc.isKwang;
        }
        return false;
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}