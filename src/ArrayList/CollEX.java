package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class CollEX {

    static void print(ArrayList lst1, ArrayList lst2) {
        System.out.println("lst1:" + lst1);
        System.out.println("lst2:" + lst2);
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList lst1 = new ArrayList<>(10);
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);

        ArrayList lst2 = new ArrayList(lst1.subList(1,3));
        print(lst1, lst2);

        Collections.sort(lst1);
        Collections.sort(lst2);
        print(lst1, lst2);
        System.out.println();
        System.out.println("containsAll: "+ lst1.containsAll(lst2));

        lst2.add("A");
        lst2.add("B");
        print(lst1, lst2);
        lst2.add(2,0);
        lst2.add(0, "0");
        print(lst1, lst2);

        System.out.println("index = " + lst2.indexOf("0"));
        System.out.println("index = " + lst2.indexOf(0));
        System.out.println();

//        lst2.remove(0);
//        print(lst1, lst2);

//        lst2.remove("0");
//        print(lst1, lst2);

        System.out.println("retainAll: "+lst1.retainAll(lst2));
        print(lst1, lst2);

//        for(int i=0; i<lst1.size(); i++) {
//            lst1.remove(i);
//        }
//        System.out.println(lst1);

        for(int i=0; i<lst2.size(); i++){
            lst2.remove(i);
        }
        System.out.println(lst2);

    }
}
