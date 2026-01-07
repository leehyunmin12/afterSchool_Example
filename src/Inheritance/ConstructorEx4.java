package Inheritance;

class A3 {
    public A3() {
        System.out.println("생성자A");
    }
    public A3(int x) {
        System.out.println("매개변수생성자A" + x);
    }
}
class B3 extends A3 {
    public B3() {
        System.out.println("생성자B");
    }
    public B3(int x) {
        super(x);
        System.out.println("매개변수생상자B" + x);
    }
}

public class ConstructorEx4 {
    public static void main(String[] args) {
        B3 b = new B3(5);
    }
}
