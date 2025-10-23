package Abstract;

abstract class Calculator {
    public abstract int add (int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
    public abstract int times(int a, int b);
    public abstract double division(int a, int b);
    public abstract int remain(int a, int b);
}

public class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) { // 추상 메소드 구현
        return a + b;
    }
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
    @Override
    public double average(int[] a) {
        double sum = 0;
        for (int i=0; i<a.length; i++)
            sum += a[i];
        return sum/a.length;
    }
    @Override
    public int times(int a, int b) {
        return a * b;
    }
    @Override
    public double division(int a, int b) {
        return a / b;
    }
    @Override
    public int remain(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2,3));
        System.out.println(c.subtract(2,3));
        System.out.println(c.average(new int [] { 2,3,4 }));
        System.out.println(c.times(2, 3));
        System.out.println(c.division(4,2));
        System.out.println(c.remain(4,2));

    }
}
