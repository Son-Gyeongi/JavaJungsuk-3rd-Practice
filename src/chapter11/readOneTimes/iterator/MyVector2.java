package chapter11.readOneTimes.iterator;

import chapter11.readOneTimes.list.vecotr.MyVector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.plaf.PanelUI;
import java.util.*;
import java.util.function.UnaryOperator;

/*
페이지 620
MyVector 클래스를 상속받는 새로운 클래스가 Iterator를 구현하도록 한 것
 */
public class MyVector2 extends MyVector implements Iterator {
    int cursor = 0;
    int lastRet = -1;

    public MyVector2(int capacity) {
        super(capacity);
    }

    public MyVector2() {
        this(10);
    }

    @Override
    public String toString() {
        String tmp = "";
        Iterator it = iterator();

        for (int i = 0; it.hasNext(); i++) {
            if (i != 0) {
                tmp += ", ";
            }
            tmp += it.next(); // tmp += next().toString();
        }

        return "[" + tmp + "]";
    }

    @NotNull
    @Override
    public Iterator iterator() {
        cursor = 0; // cursor와 lastRet을 초기화한다.
        lastRet = -1;
        return this;
    }

    @Override
    public boolean hasNext() {
        return cursor != size();
    }

    @Override
    public Object next() {
        Object next = get(cursor);
        lastRet = cursor++;
        return next;
    }

    @Override
    public void remove() {
        // 더이상 삭제할 것이 없으면 IllegalStateException을 발생시킨다.
        if (lastRet == -1) {
            throw new IllegalStateException();
        } else {
            remove(lastRet);
            cursor--; // 삭제 후에 cursor의 위치를 감소시킨다.
            lastRet = -1; // lastRet의 값을 초기화 한다.
        }
    }
}
