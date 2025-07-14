package chapter11.readOneTimes.list.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
페이지 600\
ArrayList 와 LinkedList 의 성능차이 2
ArrayList
- 배열은 각 요소들이 연속적으로 메모리상에 존재하기 때문에
 간단한 계산만으로 원하는 요소의 주소를 얻어서 저장된 데이터를 곧바로 읽어올 수 있다.
LinkedList
- 불연속적으로 위치한 각 요소들이 서로 연결된 것이라
 처음부터 n번째 데이터까지 차례대로 따라가야만 원하는 값을 얻을 수 있다.
 */
public class ArrayListLinkedListTest2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(1_000_000);
        LinkedList<String> ll = new LinkedList<>();
        add(al);
        add(ll);

        System.out.println("= 접근시간 테스트 =");
        System.out.println("ArrayList :" + access(al));
        System.out.println("LinkedList :" + access(ll));
    }

    public static void add(List list) {
        for (int i = 0; i < 100_000; i++) {
            list.add(i + "");
        }
    }

    public static long access(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
