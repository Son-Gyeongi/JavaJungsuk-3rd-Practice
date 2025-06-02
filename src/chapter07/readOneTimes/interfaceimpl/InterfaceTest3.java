package chapter07.readOneTimes.interfaceimpl;

/*
페이지 399
 */
public class InterfaceTest3 {
    public static void main(String[] args) {
        A3 a3 = new A3();
        a3.methodA();
    }
}

class A3 {
    void methodA() {
        /*
        제3의 클래스의 메서드를 통해서 인터페이스 I3을 구현한 클래스의 인스턴스를 얻어온다.
         */
        I3 i3 = InstanceManager.getInstance();
        i3.methodB3();
        System.out.println(i3.toString()); // i로 Object 클래스의 메서드 호출 가능
    }
}

interface I3 {
    public abstract void methodB3();
}

class B3 implements I3 {
    @Override
    public void methodB3() {
        System.out.println("methodB3 in B3 class");
    }

    @Override
    public String toString() {
        return "class B3";
    }
}

class InstanceManager {
    public static I3 getInstance() {
        return new B3();
    }
}