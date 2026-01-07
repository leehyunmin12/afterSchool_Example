package Test;

abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle2 extends Shape {
    double width, height;
    Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double area() {
        return width * height;
    }
}

public class ShapeEx {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle2(4, 6);

        System.out.println("원의 면적 : " + s1.area());
        System.out.println("사각형의 면적 : " + s2.area());
    }
}
