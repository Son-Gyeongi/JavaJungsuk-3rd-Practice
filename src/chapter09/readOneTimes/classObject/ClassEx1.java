package chapter09.readOneTimes.classObject;

/*
페이지 463
 */
final class CardEx1 {
    String kind;
    int num;

    public CardEx1() {
        this("SPADE", 1);
    }

    public CardEx1(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    @Override
    public String toString() {
        return kind + ":" + num;
    }
}

public class ClassEx1 {
    public static void main(String[] args) throws Exception { // Class 클래스 - newInstance() 의 필수 체크 예외 throws InstantiationException, IllegalAccessException {
        CardEx1 c = new CardEx1("HEART", 3); // new 연산자로 객체 생성
        CardEx1 c2 = CardEx1.class.newInstance(); // Class 객체를 통해서 객체 생성

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}
