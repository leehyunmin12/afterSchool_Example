package fextends;

class Point01 {
    private int x,y;
    public Point01() {
        this.x = this.y = 0;
    }
    public Point01(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void showPoint() {
        System.out.println("("+x+","+y+")");
    }
}
class ColorPoint01 extends Point01 {
    private String color;
    public ColorPoint01(String color){
        super();
        this.color = color;
    }
    public ColorPoint01(int x,int y, String color){
        super(x,y);
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}
public class SuperEx {
    public static void main(String[] args) {
        ColorPoint01 colorPoint01 = new ColorPoint01(1,2,"blue");
        colorPoint01.showPoint();
    }
}
