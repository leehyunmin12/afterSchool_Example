package Test;

import org.w3c.dom.css.Rect;

import javax.net.ssl.SSLContext;

class Rectangle {
    private int garo, sero;

    public Rectangle() {}
    public Rectangle(int garo, int sero) {
        this.garo = garo;
        this.sero = sero;
    }
    public int getArea() {
        return garo * sero;
    }
    public int getDulrae() {
        return 2*(garo + sero);
    }

    public int getGaro() {
        return garo;
    }

    public void setGaro(int garo) {
        this.garo = garo;
    }

    public int getSero() {
        return sero;
    }

    public void setSero(int sero) {
        this.sero = sero;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "가로=" + garo +
                ", 세로=" + sero +
                '}';
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rects[] = {
                new Rectangle(2,3),
                new Rectangle(5,5),
        };

        for(int i=0; i<rects.length; i++){
            System.out.println(rects[i].getArea());
            System.out.println(rects[i].getDulrae());
        }
        for(Rectangle rect : rects) {
            System.out.println(rect.getArea());
            System.out.println(rect.getDulrae());
        }


    }
}
