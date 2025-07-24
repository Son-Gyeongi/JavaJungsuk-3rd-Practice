package chapter11.readOneTimes.hashSet;

import java.util.HashSet;

/*
페이지 634
HashSet에 새로운 요소를 추가할 때 equals()와 hashCode()를 호출하기 때문에
목적에 맞게 오버라이딩해야 한다.
 */
public class HashSetEx4 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new PersonSetEx4("David", 10));
        set.add(new PersonSetEx4("David", 10));

        System.out.println(set);
    }
}

class PersonSetEx4 {
    String name;
    int age;

    public PersonSetEx4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PersonSetEx4) {
            PersonSetEx4 tmp = (PersonSetEx4) obj;
            return name.equals(tmp.name) && age == tmp.age;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (name + age).hashCode();
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }
}
