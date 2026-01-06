package Instance;

class Circle {
    private int radius;

    public Circle() {}
    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14*radius*radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

public class CircleArray {
    public static void main(String[] args) {
        Circle[] c = new Circle[5];

        for(int i=0; i<c.length;i++) {
            c[i] = new Circle(i);
        }

        for(int i=0; i<c.length; i++) {
            System.out.print((int)c[i].getArea() + " ");
        }

        System.out.println();

        for(Circle m : c) {
            System.out.print((int)m.getArea() + " ");
        }

    }
}
