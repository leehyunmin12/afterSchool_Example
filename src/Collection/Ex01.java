package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<4; i++) {
            System.out.print("이름을 입력하세요>>");
            String s = scanner.next();
            arrList.add(s);
        }

        for(int i=0; i<arrList.size(); i++) {
            String name = arrList.get(i);
            System.out.println(name + " ");
        }

        int longestIndex = 0;
        for(int i=1; i<arrList.size(); i++) {
            if(arrList.get(longestIndex).length() < arrList.get(i).length()) longestIndex = i;
        }
        System.out.println("가장 긴 이름은 : " + arrList.get(longestIndex));
        scanner.close();
    }
}
