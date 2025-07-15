package chapter11.readOneTimes.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
페이지 605
Stack - 나중에 넣은 것이 먼저 꺼내지는 구조(LIFO)
Queue - 먼저 넣은 것이 먼저 꺼내지는 구조(FIFO)
 */
public class StackQueueEx {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Queue<String> q = new LinkedList<>(); // Queue 인터페이스의 구현체인 LinkedList를 사용

        st.push("0");
        st.push("1");
        st.push("2");

        q.add("0");
        q.add("1");
        q.add("2");

        System.out.println("= Stack =");
        while (!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("= Queue =");
        while (!st.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
