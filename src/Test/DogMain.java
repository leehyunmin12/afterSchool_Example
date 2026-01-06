package Test;

class Dog {
    private String name, breed, age, color;

    public Dog() {}

    public Dog(String name, String breed, String age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "이름='" + name + '\'' +
                ", 종='" + breed + '\'' +
                ", 나이='" + age + '\'' +
                ", 색상='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void barking() {
        System.out.println("멍멍 짖는다.");
    }
    public void hungry() {
        System.out.println("배고파요");
    }
    public void sleeping() {
        System.out.println("ZZzz....");
    }

}

public class DogMain {
    public static void main(String[] args) {
        Dog dogs[] = {
                new Dog("구름이", "포메라니안", "5", "white"),
                new Dog("사낭", "치와와", "10", "white")
        };
        for(int i=0; i<dogs.length; i++) System.out.println(dogs[i]);
        for(Dog d : dogs) System.out.println(d);

    }
}
