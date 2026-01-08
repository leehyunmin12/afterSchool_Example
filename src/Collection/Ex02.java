package Collection;

import java.util.ArrayList;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(5);
        a.add(4);
        a.add(-1);

        a.add(2, 100);

        System.out.println("리스트 내의 요소 객체 수 : " + a.size());

        for(int i=0; i<a.size(); i++) {
            int n = a.get(i);
            System.out.println(n);
        }
        for(Integer arr : a) System.out.println(arr);

        int sum = 0;
        for(int i=0; i<a.size(); i++) {
            int n = a.get(i);
            sum += n;
        }
        for(Integer arr : a) {
            sum += arr;
            System.out.println(sum);
        }

        System.out.println("리스트에 있는 정수 합 : " + sum);
    }
}
