package chapter11.readOneTimes.treeSet;

import java.util.Set;
import java.util.TreeSet;

/*
페이지 641
 */
public class TreeSetLotto {
    public static void main(String[] args) {
        Set set = new TreeSet(); // 오름차순 정렬, 중복 없음

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num); // set.add(new Integer(num);
        }

        System.out.println(set);
    }
}
