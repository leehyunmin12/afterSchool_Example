package fextends;

class A {
    public A() {
        System.out.println("A");
    }
    public A(int x){
        System.out.println("A: "+x);
    }
}
class B extends A{
    public B() {
        super(100);
    }
    public B(int x){
        System.out.println("B: "+x);
    }
}

public class predict {
    public static void main(String[] args) {
        B b = new B(11);
    }
}
