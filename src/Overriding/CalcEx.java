package Overriding;

abstract class Calc {
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract double average(int a[]);
} // end

class GoodCalc extends Calc {

    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    int subtract(int a, int b) {
        return a - b;
    }

    @Override
    double average(int a[]) {
        double sum = 0;
        for (int i=0; i<a.length; i++)
            sum += a[i];
        return sum/a.length;
    }
}


public class CalcEx {
    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2, 3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int[]{2, 3, 4}));
    }
}
