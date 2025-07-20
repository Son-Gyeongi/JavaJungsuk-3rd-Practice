package chapter11.readOneTimes.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/*
페이지 616
 */
public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String string = it.next();
            System.out.println("string = " + string);
        }
    }
}
