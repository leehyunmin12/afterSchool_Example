package array;

import java.util.*;

public class ForEachEx {
    public static void main(String[] args) {
        int intArray[] = {1,2,3,4,5};
        int sum=0;
        String strArray[] = {"사과","배","바나나","체리","딸기","포도"};
        enum Week {월,화,수,목,금,토,일};

        for(int k : intArray){
            System.out.print(k+" ");
            sum+=k;
        }
        System.out.println("합은 "+sum);
        System.out.println(" 평균은 "+(double)sum/5);
        for(String k : strArray){
            System.out.print(k+" ");
        }
        System.out.println();
        for(Week day : Week.values()){
            System.out.print(day+"요일 ");
        }

    }
}
