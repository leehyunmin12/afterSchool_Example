package fextends;

class Person {
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public String get(){
        return name+"의 나이는 "+age+"세이고 키는 "+height+"cm 이며 몸무게는 "+weight+"kg 입니다.";
    }
}
class Student extends Person {
    public void set() {
        age = 17;
        name = "이현민";
        height = 187;
        setWeight(82);
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.set();
        System.out.println(s.get());
    }
}
