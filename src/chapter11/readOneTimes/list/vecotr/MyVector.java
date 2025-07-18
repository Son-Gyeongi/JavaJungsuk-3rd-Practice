package chapter11.readOneTimes.list.vecotr;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.UnaryOperator;

/*
페이지 591
 */
public class MyVector implements List {
    Object[] data = null; // 객체를 담기 위한 객체배열을 선언한다.
    int capacity = 0; // 용량
    int size = 0; // 크기

    public MyVector(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("유효하지 않은 값입니다. :" + capacity);
        }

        this.capacity = capacity;
        data = new Object[capacity];
    }

    public MyVector() {
        this(10); // 크기를 지정하지 않으면 크기를 10으로 한다.
    }

    // 최소한의 저장공간(capacity)을 확보하는 메서드
    public void ensureCapacity(int minCapacity) {
        if (minCapacity - data.length > 0) {
            setCapacity(minCapacity);
        }
    }

    @Override
    public boolean add(Object object) {
        // 새로운 객체를 저장하기 전에 저장할 공간을 확보한다.
        ensureCapacity(size + 1);
        data[size++] = object;
        return true;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        return data[index];
    }

    @Override
    public Object remove(int index) {
        Object oldObj = null;

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        oldObj = data[index];

        // 삭제하고자 하는 객체가 마지막 객체가 아니라면, 배열복사를 통해 빈자리를 채워줘야 한다.
        if (index != size - 1) {
            System.arraycopy(data, index + 1, data, index, size - index - 1);
        }
        // 마지막 데이터를 null로 한다. 배열은 0 부터 시작하므로 마지막 요소는 index가 size-1이다.
        data[size - 1] = null;
        size--;
        return oldObj;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void trimToSize() {
        setCapacity(size);
    }

    private void setCapacity(int capacity) {
        if (this.capacity == capacity) {
            return; // 크기가 같으면 변경하지 않는다.
        }

        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);

        return result;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public int capacity() {
        return capacity;
    }

    @Override
    public int size() {
        return size;
    }


    /***************************************************/
    /*     List 인터페이스로부터 상속받은 메서드들     */
    /***************************************************/
//    public int size();
//    public boolean isEmpty();

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

//    public Object[] toArray();

    @NotNull
    @Override
    public Object[] toArray(@NotNull Object[] a) {
        return null;
    }

//    public boolean add(Object o);
//    public boolean remove(Object o);


    @Override
    public boolean containsAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @NotNull Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(@NotNull Collection c) {
        return false;
    }

//    public void clear();


    @Override
    public boolean equals(Object obj) {
        return false;
    }

//    public int hashCode();
//    public Object get(int index);


    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
    }

//    public Object remove(int index);


    @Override
    public int indexOf(Object o) {
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return -1;
    }

    @NotNull
    @Override
    public ListIterator listIterator() {
        return null;
    }

    @NotNull
    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @NotNull
    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    // === JDK1.8부터 === //
    @Override
    public void sort(@Nullable Comparator c) {
        List.super.sort(c);
    }

    @NotNull
    @Override
    public Spliterator spliterator() {
        return List.super.spliterator();
    }

    @Override
    public void replaceAll(@NotNull UnaryOperator operator) {
        List.super.replaceAll(operator);
    }
}
