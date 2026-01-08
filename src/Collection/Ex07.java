package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex07 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add(0, "터미네이터");
        myList.add(2, "아바타");

        Collections.sort(myList);
        for(int i=0; i<myList.size(); i++) System.out.print(myList.get(i) + " ");
        for(String arr : myList) System.out.println(arr + " ");

        Collections.reverse(myList);
        for(int i=0; i<myList.size(); i++) System.out.print(myList.get(i) + " ");
        for(String arr : myList) System.out.println(arr + " ");

        int index = Collections.binarySearch(myList, "아바타") + 1;
        System.out.print("아바타는 " + index + "번째 요소입니다.");

    }
}
