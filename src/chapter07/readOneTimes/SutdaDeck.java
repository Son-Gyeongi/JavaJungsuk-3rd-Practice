package chapter07.readOneTimes;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    public SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            int num = i % 10 + 1;
            boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    public void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int index = (int) (Math.random() * cards.length);

            SutdaCard temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
    }

    public SutdaCard pick(int index) {
        if (index < 0 || index >= cards.length) return null;
        return cards[index];
    }

    public SutdaCard pick() {
        return pick((int) (Math.random() * cards.length));
    }
}
