package chapter11.readOneTimes.hashSet;

import java.util.HashSet;
import java.util.Set;

/*
페이지 634
 */
public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new PersonSetEx3("David", 10));
        set.add(new PersonSetEx3("David", 10));

        System.out.println(set);
    }
}

class PersonSetEx3 {
    String name;
    int age;

    public PersonSetEx3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }
}
