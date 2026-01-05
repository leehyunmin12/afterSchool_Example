package Test;

public class test3Ex {
    public static void main(String[] args) {
        String btslist[] = {"RM", "진", "슈가", "제이홉", "지민", "뷔", "정국"};
        String bplist[] = {"지수", "제니", "로제", "리사"};
        String newlist[] = {"민지","하니","다니엘","해린","혜인"};

        System.out.println("*** 방탄소년단 ***");
        for(String member : btslist) {
            System.out.println(member);
        }
        for(int i=0; i<btslist.length; i++) {
            System.out.println(btslist[i]);
        }
        System.out.println("*** 블랙핑크 ***");
        for(String member : bplist) {
            System.out.println(member);
        }
        for(int i=0; i<bplist.length; i++) {
            System.out.println(bplist[i]);
        }
        System.out.println("*** 뉴진스 ***");
        for(String member : newlist) {
            System.out.println(member);
        }
        for(int i=0; i<newlist.length; i++) {
            System.out.println(newlist[i]);
        }

    }
}
