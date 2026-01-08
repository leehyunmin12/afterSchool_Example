package Test;

import java.util.ArrayList;

public class CollectionEx1 {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<Person>();

        p.add(new Person("이현민", "서울 관악구", "010-3496-2292"));
        p.add(new Person("이현민", "강원도 양구", "010-3496-2292"));
        p.add(new Person("이현민", "미국 샌프란시스코", "010-3496-2292"));

        for(int i=0; i<p.size(); i++) System.out.println(p.get(i));
        for(Person member : p) System.out.println(member);

        ArrayList<Customer> c = new ArrayList<>();

        c.add(new Customer("이현민", "서울 관악구", "010-3496-2292",1,10000));
        c.add(new Customer("이현민", "서울 관악구", "010-3496-2292",2,100));
        c.add(new Customer("이현민", "서울 관악구", "010-3496-2292",3,5000));

        for(int i=0; i<c.size(); i++) if(c.get(i).getMile() >= 1000) System.out.println(c.get(i));
        for(Customer member : c) if(member.getMile() >= 1000) System.out.println(member);


    }
}
