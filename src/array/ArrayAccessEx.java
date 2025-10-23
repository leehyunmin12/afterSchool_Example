package array;

import java.util.Scanner;

public class ArrayAccessEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num= new int[5];
        int max=0;

        System.out.println("양수 5개를 입력하세요.");
        for(int i=0;i<5;i++){
            num[i] = scan.nextInt();
            if(num[i]>max) max = num[i];
        }
        System.out.print("가장 큰 수는 "+max+"입니다.");

    }
}
