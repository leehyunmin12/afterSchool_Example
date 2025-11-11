package ArrayList;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {

        ArrayList lst = new ArrayList();
        lst.add(10);
        lst.add(20);
        lst.add("30");

        int i = (Integer)lst.get(2);

        System.out.println(lst);

    }
}
