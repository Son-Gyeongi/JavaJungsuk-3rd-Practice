package chapter11.readOneTimes.treeSet;

import java.util.TreeSet;

/*
페이지 642
 */
public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i = 0; i < score.length; i++) {
            set.add(score[i]);
        }

        System.out.println("50보다 작은 값 : "+set.headSet(50));
        System.out.println("50보다 큰 값(50포함) : " + set.tailSet(50));
    }
}
