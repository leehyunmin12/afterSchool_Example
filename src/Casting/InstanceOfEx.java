package Casting;

import java.io.Reader;

class Person2 {

}
class Student2 extends Person2 {

}
class Researcher2 extends Person2 {

}
class Professor2 extends Researcher2 {

}

public class InstanceOfEx {
    static void print(Person2 p) {
        if(p instanceof Person2) System.out.print("Person ");
        if(p instanceof Student2) System.out.print("Student ");
        if(p instanceof Researcher2) System.out.print("Researcher ");
        if(p instanceof Professor2) System.out.print("Professor ");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("new Person() -> \t"); print(new Person2());
        System.out.print("new Student() -> \t"); print(new Student2());
        System.out.print("new Researcher() -> \t"); print(new Researcher2());
        System.out.print("new Professor() -> \t"); print(new Professor2());
    }
}
