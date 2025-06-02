package chapter07.readOneTimes.interfaceimpl;

/*
페이지 398
 */
class A2 {
    void autoplay(I i) {
        i.play();
    }
}

interface I {
    public abstract void play();
}

class B2 implements I {
    @Override
    public void play() {
        System.out.println("play in B class");
    }
}

class C2 implements I {
    @Override
    public void play() {
        System.out.println("play in C class");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.autoplay(new B2());
        a.autoplay(new C2());

    }
}
