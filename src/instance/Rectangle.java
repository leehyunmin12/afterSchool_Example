package instance;

import java.util.*;

public class Rectangle {
    int width,height;

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void getArea(){
        System.out.print(width*height);
    }

    public static void main(String[] args) {
        Rectangle ret = new Rectangle();

    }
}
