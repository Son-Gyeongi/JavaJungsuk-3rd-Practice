package chapter11.readOneTimes.stackQueue;

import java.util.PriorityQueue;
import java.util.Queue;

/*
페이지 612
PriorityQueue
- Queue 인터페이스의 구현체 중 하나로,
  저장한 순서에 관계없이 우선순위(priority)가 높은 것부터 꺼내는 특징이 있다.
- 힙 자료구조의 형태로 저장되어 있다.
 */
public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(3); // pq.offer(new Integer(3)); 오토박싱
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq); // pq의 내부 배열을 출력

        Object obj = null;

        // PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
        while ((obj = pq.poll()) != null) {
            System.out.println(obj);
        }
    }
}
