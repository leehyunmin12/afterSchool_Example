package Test;

abstract class Animal {
    abstract void sound();
}
class Dog2 extends Animal {
    @Override
    void sound() {
        System.out.println("멍멍!");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("야옹~");
    }
}

public class AnimalEx {
    public static void main(String[] args) {
        Animal a1 = new Dog2();
        Animal a2 = new Cat();

        a1.sound(); // 멍멍!
        a2.sound(); // 야옹~
    }
}
