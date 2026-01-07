package Inheritance;

class Point {
    private int x, y;

    Point() {}

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 3.  메소드, 게터, 세터
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class ColorPoint extends Point {
    // 1. 속성
    private String color;

    // 2. 생성자
    ColorPoint() {}
    ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    // 3. 메소드 getter setter, toString()

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", Color : " + this.color;
    }
}

public class ColorPointEx {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        System.out.println(p1);

        ColorPoint cp1 = new ColorPoint(4, 5, "red");
        System.out.println(cp1);
    }
}
