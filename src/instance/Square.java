package instance;

public class Square {
    int width;
    int height;

    public Square(){
        this(1,1);
    }
    public Square(int n){
        this(n,n);
    }
    public Square(int w,int h){
        width = w;
        height = h;
    }
    public String getArea(){
        return "가로 "+width+"cm, 세로 "+height+"cm 사각형의 넓이는 "+width+"*"+height+"입니다. : "+width*height;
    }

    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println(sq.getArea());
        Square sq2 = new Square(2);
        System.out.println(sq2.getArea());
        Square sq3 = new Square(4,5);
        System.out.println(sq3.getArea());
    }

}
