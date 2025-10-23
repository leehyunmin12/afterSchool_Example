package array;

import java.util.*;

public class ArrayLengthEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.print("입력받을 정수의 개수를 입력하시오 : ");
//
//        int n = scan.nextInt(),sum=0;
//        int arr[] = new int[n];
//        System.out.println(n+"개의 정수를 입력하세요");
//
//        for(int i=0;i<n;i++){
//            arr[i] = scan.nextInt();
//            sum+=arr[i];
//        }
//        System.out.print("평균은 "+(double)sum/n);

        enum Week {월,화,수,목,금,토,일}
        for (Week day : Week.values())
            System.out.println(day+"요일");

    }
}
