package chapter11.readOneTimes.hashSet;

import java.util.*;

/*
페이지 633
 */
public class Bingo {
    public static void main(String[] args) {
        Set set = new HashSet(); // 저장된 순서를 보장하지 않고 자체적인 저장방식에 따라 순서가 결정된다.
//        Set set = new LinkedHashSet();
        int[][] board = new int[5][5];

        for (int i = 0; set.size() < 25; i++) {
            set.add((int) (Math.random() * 50) + 1 + "");
        }

        Iterator it = set.iterator();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
