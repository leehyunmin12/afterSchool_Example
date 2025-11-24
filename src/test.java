class Parent {
    String name;
    void pr()
    {
        System.out.println("부모 클래스의 pr메소드");
    }
}
class Child extends Parent {
    String desc;
    public void pr() {
        System.out.println("자식 클래스의 pr메소드");
    }
}
public class test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.name = "Developer";
        Child c = (Child)p;
        c.desc = "나는 프로그래머";
        System.out.println(c.desc);
        c.pr();
        System.out.println(c.name);
        Child c2 = new Child();
        c2.name = "Programmer";
        Parent p2 = c2;
        p2.pr();
        System.out.println(p2.name);
        //System.out.println(p2.desc);
    }
}
